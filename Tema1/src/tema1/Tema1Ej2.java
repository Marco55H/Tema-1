package tema1;

import java.util.Scanner;

public class Tema1Ej2 {
	 public static void main(String[] args) {
		 //Definimos la variable edad
		 int edad;
		 //Defino la variable mayor como boolean
		 boolean mayor;
		 //Inicializo el escaner
		 Scanner sc = new Scanner(System.in);
            // pedimos que el usuario nos de su edad
	        System.out.print("Por favor, ingrese su edad: ");
	        //Leemos su edad por el teclado
	         edad = sc.nextInt();
            // mayor va a ser true si la edad es mayor que 18
	        mayor = edad >= 18;

	        // Usamos una expresión  para mostrar el resultado
	        System.out.println("Usted es mayor de edad? " + mayor);

	        sc.close();
   
	}

}
