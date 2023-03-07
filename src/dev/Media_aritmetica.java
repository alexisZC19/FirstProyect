package dev;

import java.util.Scanner;

public class Media_aritmetica {
	public static void main(String[] args) {
		System.out.println("Media aritmetica");
		
		int j, i, sumas;
		double promedf;
		sumas=0;
		Scanner num= new Scanner(System.in);
		
	for(j=1;j<=3;j++){	
		System.out.println("Ingrese el valor de la calf :" + j);
		i=num.nextInt();
			
	sumas=sumas+i;
	
	}
	System.out.println("la suma total de los tres promedios es : " + sumas);
	
	promedf=sumas/3;
	
	System.out.println("el promedio del alumno es de : " + promedf);
	
	

	
}
}


