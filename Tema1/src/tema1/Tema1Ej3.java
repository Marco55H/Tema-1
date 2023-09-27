package tema1;

import java.util.Scanner;

public class Tema1Ej3 {
	public static void main(String[] args) {
		int num;
		int resto;
		boolean par;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		resto=num%2;
		
		par = resto==0;
		
		System.out.println("¿Tú número es par? " +par    );
		sc.close();
		
		
	}
}
