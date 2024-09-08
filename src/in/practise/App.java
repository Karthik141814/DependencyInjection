package in.practise;

public class App {
	
	public static void main(String[] args) {
		
		IPayment p1=new DebitCardPayment();
		IPayment p2=new CreditCardPayment();
		
		//Construction Injection Called
		PaymentService service =new PaymentService(p1);
		
		//Setter Injection Called
		
		service.setPayment(p2);
		
		service.doPayment(450.50);
				
	}

}
