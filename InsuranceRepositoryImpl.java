package com.infy.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.infy.exception.InsuranceException;
import com.infy.model.PolicyDTO;

public class InsuranceRepositoryImpl implements InsuranceRepository{


	public String buyPolicy(PolicyDTO policy) throws InsuranceException{
		
		return policy.getPolicyNumber();
	}


	public List<PolicyDTO> getAllPolicyDetails() throws InsuranceException{
		// TODO Auto-generated method stub
		List<PolicyDTO> allPolicyDetails=new ArrayList<PolicyDTO>();
		PolicyDTO policy1=new PolicyDTO();
		policy1.setDateOfBirth(LocalDate.of(1989, 5, 10));
		policy1.setPolicyHolderName("Maria");
		policy1.setPolicyName("Retirement");
		policy1.setPolicyNumber("TL-309981");
		policy1.setPolicyType("Term Life Insurance");
		policy1.setPremium(5545.0d);
		policy1.setTenureInMonths(300);
		
		PolicyDTO policy2=new PolicyDTO();
		policy2.setDateOfBirth(LocalDate.of(1987, 11, 23));
		policy2.setPolicyHolderName("Tom");
		policy2.setPolicyName("Retirement");
		policy2.setPolicyNumber("WP-774312");
		policy2.setPolicyType("Whole Life Policy");
		policy2.setPremium(6330.0d);
		policy2.setTenureInMonths(300);
		
		PolicyDTO policy3=new PolicyDTO();
		policy3.setDateOfBirth(LocalDate.of(1999, 4, 10));
		policy3.setPolicyHolderName("Pamela");
		policy3.setPolicyName("Retirement");
		policy3.setPolicyNumber("WP-900012");
		policy3.setPolicyType("Whole Life Policy");
		policy3.setPremium(3454.0d);
		policy3.setTenureInMonths(360);
		
		PolicyDTO policy4=new PolicyDTO();
		policy4.setDateOfBirth(LocalDate.of(1975,10, 23));
		policy4.setPolicyHolderName("Roger");
		policy4.setPolicyName("AccidentalCoverage");
		policy4.setPolicyNumber("TL-552189");
		policy4.setPolicyType("Term Life Insurance");
		policy4.setPremium(7999.0d);
		policy4.setTenureInMonths(100);
		
		PolicyDTO policy5=new PolicyDTO();
		policy5.setDateOfBirth(LocalDate.of(2007, 11, 7));
		policy5.setPolicyHolderName("John M");
		policy5.setPolicyName("AccidentalCoverage");
		policy5.setPolicyNumber("TL-002319");
		policy5.setPolicyType("Term Life Insurance");
		policy5.setPremium(973.0d);
		policy5.setTenureInMonths(420);
		
		PolicyDTO policy6=new PolicyDTO();
		policy6.setDateOfBirth(LocalDate.of(2011, 1, 29));
		policy6.setPolicyHolderName("Joey T");
		policy6.setPolicyName("Retirement");
		policy6.setPolicyNumber("WP-991423");
		policy6.setPolicyType("Whole Life Policy");
		policy6.setPremium(554.0d);
		policy6.setTenureInMonths(420);
		
		PolicyDTO policy7=new PolicyDTO();
		policy7.setDateOfBirth(LocalDate.of(1993, 12, 31));
		policy7.setPolicyHolderName("Tim");
		policy7.setPolicyName("Pension");
		policy7.setPolicyNumber("WP-100098");
		policy7.setPolicyType("Whole Life Policy");
		policy7.setPremium(2876.0d);
		policy7.setTenureInMonths(330);
		
		PolicyDTO policy8=new PolicyDTO();
		policy8.setDateOfBirth(LocalDate.of(1983, 7, 1));
		policy8.setPolicyHolderName("Alia");
		policy8.setPolicyName("AccidentalCoverage");
		policy8.setPolicyNumber("WP-887132");
		policy8.setPolicyType("Whole Life Policy");
		policy8.setPremium(7887.0d);
		policy8.setTenureInMonths(252);
		
		PolicyDTO policy9=new PolicyDTO();
		policy9.setDateOfBirth(LocalDate.of(1964, 1, 17));
		policy9.setPolicyHolderName("Ranger");
		policy9.setPolicyName("Retirement");
		policy9.setPolicyNumber("WP-000057");
		policy9.setPolicyType("Whole Life Policy");
		policy9.setPremium(9345.0d);
		policy9.setTenureInMonths(84);
	
		PolicyDTO policy10=new PolicyDTO();
		policy10.setDateOfBirth(LocalDate.of(2014, 3, 10));
		policy10.setPolicyHolderName("Peter");
		policy10.setPolicyName("Retirement");
		policy10.setPolicyNumber("WP-678997");
		policy10.setPolicyType("Whole Life Policy");
		policy10.setPremium(432.0d);
		policy10.setTenureInMonths(240);
		
		
		allPolicyDetails.add(policy1);
		allPolicyDetails.add(policy2);
		allPolicyDetails.add(policy3);
		allPolicyDetails.add(policy4);
		allPolicyDetails.add(policy5);
		allPolicyDetails.add(policy6);
		allPolicyDetails.add(policy7);
		allPolicyDetails.add(policy8);
		allPolicyDetails.add(policy9);
		allPolicyDetails.add(policy10);
		
		return allPolicyDetails;
	}

	
}
