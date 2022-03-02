package main;

import java.util.Scanner;

public class mainit {
	
	public static void main(String[] args) {
		System.out.println("Hola mundo Java :D");
		System.out.println("Introduzca el número que desee usar:");
		Scanner sc = new Scanner(System.in);
		int numero1 = sc.nextInt();
		System.out.println("Hemos introducido el número: " + numero1);
		
		// Prueba de la suma de dos números
		int sumaDosNumeros = Suma.sumaDosNumeros(5, 6);
		System.out.println("Resultado de los dos números: " +  sumaDosNumeros);
		
		// Prueba de la suma acumulada
		
		int sumaAcumulada = Suma.sumaAcumulada(1,2,7,9,numero1);
		System.out.println("Resultado de la suma acumulada: " + sumaAcumulada);
		
		System.out.println("Fin del programa. Espero que le haya sido de utilidad.");
		
		// Prueba de la resta de dos números
		int restaDosNumeros = Resta.restaDosNumeros(6, 5);
		System.out.println("Resultado de la resta de dos números: " +  restaDosNumeros);
				
		// Prueba de la resta acumulada
				
		int restaAcumulada = Resta.restaAcumulada(1,2,7,9,numero1);
		System.out.println("Resultado de la resta acumulada: " + sumaAcumulada);
		System.out.println("Prueba para la rama de resta");
		
		System.out.println("Fin del programa. Espero que le haya sido de utilidad.");
		
		
		
	}

}
