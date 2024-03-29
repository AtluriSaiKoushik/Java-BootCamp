package com.wipro.bank.acc;

public abstract class Account {
	int tenure;
	float principal;
	float rateOfInterest;
	public void setInterest(int age, String gender)
	{
	if(gender.equalsIgnoreCase("Male"))
	{
	if(age<60)
	{
		rateOfInterest=9.8f;
	}
	else if(age>=60)
	{
		rateOfInterest=10.5f;
	}
	}
	if(gender.equalsIgnoreCase("Female"))
	{
	if(age<58)
	{
		rateOfInterest=10.2f;
	}
	else if(age>=58)
	{
		rateOfInterest=10.8f;
	}
	}
	
	
}
	public float calculateMaturityAmount(float totalPrincipleDeposited,float maturityInterest)
	{
		return totalPrincipleDeposited+maturityInterest;
		
	}
	public abstract float calculateInterest();
	public abstract float calculateAmountDeposited();


}
