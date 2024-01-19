package unidad4;

import java.util.Scanner;

/**
 * @author Nicolai Marlon Schirmer
 */

public class PruebaDeGITHUB {	
	
	/**
	 * Es un programa para calcular el area, diametro y perimetro de un circulo, usando un radio
	 * @param args
	 */
	
	public static void main(String[] args) {

		/** 
		 * El metodo principal de esta clase
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Introduce el radio de una circunferencia en cm: ");
		float radio =scan.nextFloat();
		
	/**
	 * Declaracion de la variable radio, necesaria para todos los calculos.
	 */
		System.out.println("Introduce el numero correspondiete al calculo que quieres hacer:");
		System.out.println("1. Calculo de diametro");
		System.out.println("2. Calculo de perimetro");
		System.out.println("3. Calculo de area");
		byte eleccion=scan.nextByte();
	/**
	 * Eleccion es una variable byte porque el tamanyo del menu de eleccion no supera su limite
	 */
		switch (eleccion) {
		case 1:
			System.out.println("El diametro equivale a: " + 2*radio + " cm" );
			break;
		case 2:
			System.out.println("El perimetro equivale a: " + (float)2*Math.PI*radio + " cm");
			break;
		case 3:
			System.out.println("El area equivale a: " + (float)Math.PI*Math.pow(radio, 2) + (" cm^2") );
			break;
		default:
			System.out.println("Error, introduce un numero correcto.");
		}
		scan.close();
	}

}
