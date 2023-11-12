package CanvasD9;

import java.util.Scanner;

public class Ex01if {

	public static void main(String[] args) {
	
		int n1,n2,n3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: (A)");
		n1 = leia.nextInt();
		System.out.println("Entre com o segundo número: (B)");
		n2 = leia.nextInt();
		System.out.println("Entre com o último número: (C)");
		n3 = leia.nextInt();
		
		if (n1 + n2 > n3) {
			System.out.println("O valor da soma de A+B é maior que o valor de C");
		}
		if (n1 + n2 < n3) {
			System.out.println("O valor da soma de A+B é menor que o valor de C");
		}
		if (n1 + n2 == n3) {
			System.out.println("O valor da soma de A+B é igual ao valor de C");
		}
		
	
	}

}
	