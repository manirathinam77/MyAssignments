package week1.day1;

public class Calculator {
	public void sub() 
	{int a=5;
	 int b=20;
	 int c=b-a;
	 System.out.println(c);
	 }	
	public  int multiply(int a,int b)
	{ return a*b;
}
public static void main(String[] args) {
	Calculator call=new Calculator();
	call.sub();
	int multiply =call.multiply(10, 20);
	System.out.println(multiply);

}
	}
