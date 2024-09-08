package in.practise;

public class CreditCardPayment implements IPayment{

	@Override
	public boolean processPayment(double billAmt) {
		//Business Logic
		System.out.println("Credit Card Payment Proceed ......");
		return true;
	}
}
