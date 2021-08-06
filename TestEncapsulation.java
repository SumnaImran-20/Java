public class TestEncapsulation
{
	public static void main (String args[])
	{
        Accounts obj=new Accounts();
        obj.showAccount_number(7560504000L);
        obj.showName("Sumna Imran");
        obj.showEmail("sumna.imran87@gmail.com");	
        obj.showAmount(25000);
        System.out.println("Account Number is: " + obj.getAccount_number() + " Name is: " + obj.getName() + " Email is: " + obj.getEmail() + " Amount is: "+ obj.getAmount());		
		
	}
}

class Accounts
{
	private long account_number;
	private String name, email;
	private float amount;
	
	public long getAccount_number()
	{
		return account_number;
	}
	
	public void showAccount_number(long account_number)
	{
		this.account_number=account_number;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void showName(String name)
	{
		this.name=name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void showEmail(String email)
	{
		this.email=email;
	}
	
	public float getAmount()
	{
		return amount;
	}
	
	public void showAmount(float amount)
	{
		this.amount=amount;
	}
}