package unidad1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("dime un numero: ");
		float num1=scan.nextInt();
		System.out.println("dime otro numero: ");
		int num2=scan.nextInt();
		
		System.out.println("La media aritmética es: "+(num1+num2)/2);
		scan.close();
	}

}
