package pakage;

public class Recursividad {

	public static void main(String[] args) {

		int n = 3;
		
		System.out.println("El valor de n de la serie fibonacci es: " + fibonacci(n));
		
	}

	public static int fibonacci (int n) {
		int r;
		
		if (n < 2) {
			r = n;
		} else {
			r = fibonacci(n - 1) + fibonacci(n - 2);
		}
		return r;
	}
}