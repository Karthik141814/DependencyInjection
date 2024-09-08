package in.practise;

public class AmexCardPayment implements IPayment{

	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("Amex Card Payment Proceed ....");
		return true;
	}
}
