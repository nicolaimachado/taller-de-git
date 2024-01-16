package unidad1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
			System.out.println("Introduce la base en metros:");
			float base=scan.nextFloat();
			System.out.println("Introduce la altura en metros:");
			float altura=scan.nextFloat();
			
				System.out.println("EL área es de: "+(base*altura)/2 +" m^2");
		scan.close();
	}

}
