package in.practise;

public class SodexoPayment implements IPayment {
	
@Override
	public boolean processPayment(double billAmt) {
		System.out.println("Sodexo Payments Proceed...");
		return true;
	}

}
