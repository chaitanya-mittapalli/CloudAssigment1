package com.cloud.view;


public class Customer 
{
    private String name;
    private int number;
    private boolean isPrime;
   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void validate(int number)
	{
		int temp;
		this.isPrime=true;
		for(int i=2;i<=number/2;i++)
		{
	          temp=number%i;
		   if(temp==0)
		   {
		      this.isPrime=false;
		      break;
		   }
		}
		
	}
	public boolean getPrime() {
		return isPrime;
	}
	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}

}
