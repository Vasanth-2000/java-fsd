package projects;

public class Callbyvalue {
	int y=200;
	int operation(int y) {
	y=y*50;
	return(y);
	}
	public static void main(String[] args) {
		Callbyvalue a=new Callbyvalue();
		System.out.println("Value before the operation"+" "+ a.y);
		a.operation(100);
		System.out.println("Value after the operation"+" "+ a.y);
		}
	
}
