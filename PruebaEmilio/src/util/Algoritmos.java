package util;


public abstract class Algoritmos {

	/**
	 * 
	 * @param a Numero a comprobar.
	 * @return me devuelve la secuencia fibo
	 */
	public static int fibonacci (int a) {
		if (a==0) {
			return 0;
		} else if (a==1) {
			return 1;
		}
		else {
			return fibonacci(a-1)+fibonacci(a-2);
		}
	}
	
	/**
	 * 
	 * @param a Numero a comprobar.
	 * @return me devuelve la secuencia factorial
	 */
	public static int factorial (int a) {
		int factorial = 1;
		for (int i = 1; i <= a; i++) {
			factorial = factorial *i;
			
		}
		return factorial;
	}
	/**
	 * 
	 * @param a Numero a comprobar en boolean.
	 * @return me devuelve verdadero si es primo
	 */
	public static boolean esPrimo (int a) {
		boolean primo = true;
		for (int i = 2; i < a; i++) {
			if (a % i ==0) {
				primo = false;
				break;
			}
		}
		return primo;
	
	}
	
	
	
	
	
	
	
	
	
	
	
}


