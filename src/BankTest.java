import bankexception.IncomeProofException;
import bankexception.InsufficientBalanceException;
import bankexception.InvalidNameException;
import bankexception.NegativeAccountNumberException;
import bankexception.OpeningBalanceException;


public class BankTest {
	public static void main(String[] args) {
		
		BankAccount ba1=null;
		try {
			 ba1 = new BankAccount(101,"Jagga","Jasoos",10000);
		} catch (OpeningBalanceException e) {
			System.out.println("Cannot Open Account:"+ e);
		}
		catch (NegativeAccountNumberException e) {
			System.out.println("Cannot Open Account:"+ e);
		}
		catch (InvalidNameException e) {
			System.out.println("Cannot Open Account:"+ e);
		}
	
		try {
			ba1.debit(5000);
		}
		catch(NullPointerException e) {
			System.out.println("Account Couldn't Be Opened!");
		}
		
		
		try {
			ba1.credit(500);
		}
		catch(NullPointerException e) {
			System.out.println("Account Couldn't Be Opened!");
		}
		
	}
}

class BankAccount {
	private int accNum;
	private String accHolder;
	private int accBal;
	
	private boolean nameProper;
	
	
	public BankAccount(int accNum, String fName,String lName, int accBal) throws OpeningBalanceException,InvalidNameException,NegativeAccountNumberException
	{
		super();
		nameProper = false;
		this.accNum = accNum;
		if(accBal < 3000)
		{
			throw new OpeningBalanceException("Minimum Rs. 3000 required");
		}
		else
		{
			this.accBal = accBal;
		}
		
		if(fName.matches("^[a-zA-Z]+$")==false){
			throw new InvalidNameException("First Name must be a string");
		}
		else {
			nameProper = true;
		}
		if(lName.matches("^[a-zA-Z]+$")==false){
			throw new InvalidNameException("Last Name must be a string");
		}
		else {
			nameProper = true;
		}
		if(nameProper == true) {
			accHolder = fName + " " + lName;
		}
		
		if(accNum < 0) {
			throw new NegativeAccountNumberException("Ehh! Negative Account Number ?");
		}
		
	}
	
	public void debit(double amt) {
		if(amt <= accBal) {
			accBal -= amt;
		}
		else {
			throw new InsufficientBalanceException("Insufficient Funds");
		}
	}
	
	public void credit(double amt) {
		if(amt > 49999) {
			throw new IncomeProofException("Show PAN to the Bank Staff");
		}
		else {
			accBal += amt;
			System.out.println("Done!!");
		}
	}
	
}