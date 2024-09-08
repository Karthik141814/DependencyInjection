package in.practise;

public class DebitCardPayment implements IPayment {
	
	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("Debit Card payment Successed.....");
		return true;
	}
	
	

}
