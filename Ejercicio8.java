package unidad1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Introduce la hora: ");
		int h=scan.nextInt();
		
		System.out.println("Introduce los minutos: ");
		int min=scan.nextInt();
		
		System.out.println("Introduce los segundos: ");
		int seg=scan.nextInt();
		
		int sbase=seg;
		sbase=sbase/60;
		seg=seg%60;
		
		min=min+sbase;
		int mbase=min;
		mbase=min/60;
		min=min%60;
		
		h=h+mbase;
		
		System.out.println(h + " horas " + min + " minutos " + seg + " segundos ");
		
		scan.close();

	}

}
