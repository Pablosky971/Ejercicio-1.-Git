package main;

public class Suma {
	
	

	public static int sumaDosNumeros(int n1, int n2) {
		return n1 + n2;
	}
	
	public static int sumaAcumulada(int ... numeros) {
		 int acum = 0;
		for(int n:numeros) {
			
			acum += n;
			
		}
		
		return acum;
		
	}
	

}
