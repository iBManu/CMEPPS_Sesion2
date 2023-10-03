package pkg;

public class Calculadora {
	public static int suma(int a, int b) {
		return(a+b);
	}
	
	public static int resta(int a, int b) {
		return(a-b);
	}
	
	public static int multiplica(int a, int b) {
		return(a*b);
	}
	
	public static int divide(int a, int b) {
		if(b == 0)
			return -1;
		
		return(a/b);
	}
}
