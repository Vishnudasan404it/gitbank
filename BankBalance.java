package Git;

	import org.testng.Assert;
	import org.testng.annotations.Test;
	
	public class BankBalance{
	    
	
		@Test
	    public void Deposit() {
	        Bank bank = new Bank("Vishnu", 1000);
	        bank.deposit(100);
	        Assert.assertEquals(bank.checkBalance(), 1100);
	    }

	    @Test(expectedExceptions = IllegalArgumentException.class)
	    public void testInvalidDeposit() {
	        Bank bank = new Bank("Selva", 2000);
	        bank.deposit(-1000);
	    }

	    @Test
	    public void Withdraw() {
	        Bank bank = new Bank("John", 2000);
	        bank.withdraw(1500);
	        Assert.assertEquals(bank.checkBalance(), 500);
	    }

	    @Test(expectedExceptions = IllegalArgumentException.class)
	    public void InvalidWithdraw() {
	        Bank bank = new Bank("kumar", 500);
	        bank.withdraw(1000);
	    }

	    @Test(expectedExceptions = IllegalArgumentException.class)
	    public void InsufficientBalanceWithdraw() {
	        Bank bank = new Bank("sara", 300);
	        bank.withdraw(500);
	    }
	}


