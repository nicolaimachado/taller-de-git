package unidad1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Introduce la cantidad de millas que quieres convertir a metros:");
		 float millas=scan.nextFloat();
		System.out.println("Metros: "+(millas*1609.344));
		scan.close();
	}
}
