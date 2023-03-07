package dev;

import java.util.Scanner;

public class DESVIACION {
	public static void main(String[] args) {
	
		System.out.println("DESVIACION ESTANDAR");
		
		int i;

		
		int suma = 0;
		int m [] = new int[10];
		int media = 0;
		double var = 0.0;
		double desviacion = 0.0;
		Scanner troll= new Scanner(System.in);
		
		
		
		for(i=1;i<=6;i ++){
			
			System.out.println("Ingrese el valor " + i);
			m[i]=troll.nextInt();
			
			suma = suma+m[i];	
			
		}
		troll.close();// se cierra la entrada de datos
		
		System.out.println("el valor es de " + suma);
		
		media=suma/6;
		
		
		 for(i = 1 ; i<=6; i++){
			   double rango;
			   rango = Math.pow(m[i] - media,2f);
			   var = var + rango;
			  }
			  var = var / 6f;
		
			  desviacion = Math.sqrt(var);
			  
			  //impresion de resultados de las operaciones
			  System.out.println("Media: " + media);
			  System.out.println("Varianza: " + var);
			  System.out.println("Desvianción Estándar: " + desviacion);
		
	}

}
