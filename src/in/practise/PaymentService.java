package in.practise;

public class PaymentService {
	
	private IPayment payment;
	
	//Constructor Injection
	public PaymentService(IPayment payment){
		this.payment=payment;
		
	}
	//SetterInjection
	public void  setPayment(IPayment payment) {
		this.payment=payment;
	}
	public void doPayment(double billAmt) {
		boolean status=payment.processPayment(billAmt);
		if(status) {
			System.out.println("Provide the Receipt...........");
		}
		else {
			System.out.println("Payment Declined......");
		}
	}

}
