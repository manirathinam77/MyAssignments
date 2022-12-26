package week1.day1b;

public class Mobile {

		
		public void makeCall() {
			String mobileModel= "Oppo";
			float mobileWeight= 156.7f;
			
	        System.out.println(mobileModel);
	        
	        System.out.println(mobileWeight);
		}
			public void sendMsg() {
			boolean fullyCharged= true;
			int mobileCost = 20000;
			
	         System.out.println(fullyCharged);
	         
	         System.out.println(mobileCost);

		}
		

		public static void main(String[] args) {
			
			System.out.println("This is my Mobile");
			Mobile Oppo = new Mobile();
			
			Oppo.makeCall();
			Oppo.sendMsg();

		}
					
			}
