package unidad1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
			System.out.println("Introduce los grados en cent�grados: ");
			float cent=scan.nextFloat();
			System.out.println(cent+"�C equivale a "+(9*cent/5+32)+"�F");
		scan.close();
	}

}
