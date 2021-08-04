package com.infy.validator;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.apache.commons.logging.LogFactory;

import com.infy.exception.InsuranceException;
import com.infy.model.PolicyDTO;

public class Validator {


	public static void validate(PolicyDTO policy) throws InsuranceException{
		try {
			String msg=null;
			if(!validatePolicyName(policy.getPolicyName()))
			{
				msg="Validator.INVALID_POLICY_NAME";
			}
			else if(!validatePolicyType(policy.getPolicyType()))
			{
				msg="Validator.INVALID_POLICY_TYPE";
			}
			else if(!validatePremium(policy.getPremium()))
			{
				msg="Validator.INVALID_PREMIUM";
			}
			else if(!validateTenure(policy.getTenureInMonths()))
			{
				msg="Validator.INVALID_TENURE";
			}
			else if(!validateDateOfBirth(policy.getDateOfBirth()))
			{
				msg="Validator.INVALID_DOB";
			}
			else if(!validatePolicyNumber(policy.getPolicyNumber(), policy.getPolicyType()))
			{
				msg="Validator.INVALID_POLICY_NUMBER";
			}
			else if(!validatePolicyHolderName(policy.getPolicyHolderName()))
			{
				msg="Validator.INVALID_HOLDER_NAME";
			}
			if(msg!=null)
			{
				InsuranceException ee=new InsuranceException(msg);
				throw ee;
			}
		}
		catch(InsuranceException ee)
		{
			LogFactory.getLog(Validator.class).error(ee.getMessage(), ee);
			throw ee;
		}
	}

//	validatePolicyName(String policyName)
//
//	The method validates policyName.
//
//	The policyName should contain only alphabets and it should not be empty.
//
//	If the above conditions are satisfied, return true, otherwise return false. 
	public static Boolean validatePolicyName(String policyName){
		if(!policyName.isEmpty() || policyName.matches("[A-Za-z]"))
		{
			return true;
			
		}
		else
		{
			return false;
		}
		//return null;

	}
	
	
//	This method validates policyType.
//
//	The policyType should be one among following:
//
//	Term Life Insurance
//
//	Whole Life Policy
//
//	Endowment Plans
//
//	If the above conditions are satisfied, return true, otherwise return false. 
//	Perform case sensitive operation.
	public static Boolean validatePolicyType(String policyType){
		String name1="Term Life Insurance";
		String name2="Whole Life Policy";
		String name3="Endowment Plans";
		if(policyType==name1 || policyType==name2 || policyType==name3)
		{
			return true;
		}
		else
		{
			return false;
		}
		//return null;

	}
	
	
//	This method validates premium.
//
//	The premium should be more than 100.
//
//	If the above conditions are satisfied, return true, otherwise return false.
//

	public static Boolean validatePremium(Double premium){
		if(premium>100)
		{
			return true;
		}
		else
		{
			return false;
		}
	//	return null;

	}
	
	
//	This method validates tenureInMonths.
//
//	The tenureInMonths should be more than 24
//
//	If the above conditions are satisfied, return true, otherwise return false.
//

	public static Boolean validateTenure(Integer tenureInMonths){
		if(tenureInMonths>24)
		{
			return true;
		}
		else
		{
			return false;
		}

	}

//	This method validates dateOfBirth.
//
//	The dateOfBirth should be before today.
//
//	If the above conditions are satisfied, return true, otherwise return false.
	public static Boolean validateDateOfBirth(LocalDate dateOfBirth){
		LocalDate date=LocalDate.now();
		if(ChronoUnit.DAYS.between(dateOfBirth,date)>=1)
		{
			return true;
		}
		else
		{
			return false;
		}
		//return null;

	}

//	This method validates policyNumber.
//
//	The policyNumber should be in <<1st Part>>-<<2nd part>> format
//
//	2nd part is a 6 digit number
//
//	1st part is as per the table below:
//
//
//
//	If the above conditions are satisfied, return true, otherwise return false. Perform case sensitive operation.
	public static Boolean validatePolicyNumber(String policyNumber,String policyType){
		String Regex="(TL|WL|EP)-[0-9]{6}";
		if(policyNumber.matches(Regex))
		{
			return true;
		}
		else
		{
			return false;
		}
	//	return null;

	}

	
//	This method validates policyHolderName.
//
//	The policyHolderName should contain at least 1 word of length at least 3.
//
//	If there are more than 1 word then each word should be separated by single space and should not be empty.
//
//	If the above conditions are satisfied, return true, otherwise return false.
	public static Boolean validatePolicyHolderName(String policyHolderName){
		if(policyHolderName.length()>=3  || policyHolderName.matches("[A-Za-z]{3, } \\S+"))
		{
			return true;
		}
		else
		{
			return false;
		}
		//return null;

	}
}
