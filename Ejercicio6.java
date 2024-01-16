package unidad1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Introduce un numero: ");
			float num1=scan.nextFloat();
		System.out.println("Introduce otro: ");
			float num2=scan.nextFloat();
		System.out.println("Introduce uno más: ");
			float num3=scan.nextFloat();
		System.out.println("Introduce uno último: ");
			float num4=scan.nextFloat();
				System.out.println("La media de estos numeros es: "+(int)(num1+num2+num3+num4)/4);
		scan.close();
	}
}
