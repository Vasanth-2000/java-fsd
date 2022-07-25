package demo;

public class typeCasting {
	public static void main(String[] args) {
		
		//implicit conversion
		System.out.println("Implicit conversion");		
		char a='C';
		System.out.println("the value of a is" +" "+a);		
		int b= 'C';
		System.out.println("the value of b is"+" "+b);
		float c='C';
		System.out.println("The value of c is"+" "+c);
		long d='C';
		System.out.println("the value of d is"+" "+d);
		double e='C';
		System.out.println("the value of e is"+" "+e);
		System.out.println("\n");
		System.out.println("Explicit conversion");
		
		//explicit conversion
		double x=85.7892;
		int y=(int)x;
		short z=(short)x;
		System.out.println("the value of x is"+" "+ x);
		System.out.println("the value of y is"+" "+ y);
		System.out.println("the value of z is"+" "+ z);
	}

}
