package com.infy.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.infy.exception.InsuranceException;
import com.infy.model.PolicyDTO;
import com.infy.model.PolicyReportDTO;
import com.infy.repository.InsuranceRepository;
import com.infy.validator.Validator;

public class InsuranceServiceImpl implements InsuranceService{

	@Autowired
	private InsuranceRepository insuranceRepository;
	
	
	public String buyPolicy(PolicyDTO policy) throws InsuranceException {
		try
		{
			Validator.validate(policy);
			return insuranceRepository.buyPolicy(policy);
		}
		catch(InsuranceException ee)
		{
			LogFactory.getLog(InsuranceServiceImpl.class).error(ee.getMessage(), ee);
			throw ee;
		}
	}

	public Long calculateAge(LocalDate dateOfBirth) throws InsuranceException {
		Long age=ChronoUnit.MONTHS.between(dateOfBirth, LocalDate.now());
		return age;
	}

	public List<PolicyReportDTO> getReport(String policyType) throws InsuranceException {
		List<PolicyReportDTO> policyList=new ArrayList<>();
		List<PolicyDTO> dtoList=insuranceRepository.getAllPolicyDetails();
		for(PolicyDTO p:dtoList)
		{
//			policyNumber;
//			private String policyHolderName;
//			private Double policyHolderAge;
//			private Integer tenureInMonths
			if(p.getPolicyType().equals(policyType))
			{
				PolicyReportDTO policy=new PolicyReportDTO();
				policy.setPolicyNumber(p.getPolicyNumber());
				policy.setPolicyHolderAge((double)calculateAge(p.getDateOfBirth()));
				policy.setPolicyHolderName(p.getPolicyHolderName());
				policy.setTenureInMonths(p.getTenureInMonths());
				
				policyList.add(policy);
			}
		}
		try {
			if(policyList.isEmpty())
			{
				throw new InsuranceException("Service.NO_RECORD");
			}
			else
			{
				return policyList;
			}
		}
		catch(InsuranceException ee)
		{
			if(ee.getMessage().startsWith("Service"))
			{
				LogFactory.getLog(getClass()).error(ee.getMessage(), ee);
			}
			else
			{
				throw ee;
			}
		}
		return null;
	}

		
	
	
}
