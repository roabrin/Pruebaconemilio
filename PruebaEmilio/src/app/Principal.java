package app;

import util.Algoritmos;

public class Principal {

	public static void main(String[] args) {
		
		
	int []array = new int [5];
	
	for (int i = 0; i < array.length; i++) {
		array[i]=(int)(Math.random()*10)+1;
	}
		
	
	
	int [] fiboresultado = new int [5];
	
	for (int i = 0; i < array.length; i++) {
		fiboresultado[i]=Algoritmos.fibonacci(array[i]);
	}
		
	int [] resultadoFactorial = new int [5];
	
	for (int i = 0; i < array.length; i++) {
		resultadoFactorial [i]= Algoritmos.factorial(array[i]);
	}
	
		boolean [] resultadobu = new boolean [5];
		
		for (int i = 0; i < array.length; i++) {
			resultadobu[i]=Algoritmos.esPrimo(array[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
