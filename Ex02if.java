package CanvasD9;

import java.util.Scanner;

public class Ex02if {

	public static void main(String[] args) {
		int n1;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		n1 = leia.nextInt();
		//if (numero < 0 && numero % 2 != 0
		if (n1 % 2 != 0 && n1 < 0) {
			System.out.println("O número é ímpar e negativo");
		}
		if (n1 % 2 == 1 && n1 > 0) {
			System.out.println("O número é ímpar e positivo");
		}
		if (n1 % 2 == 0 && n1 < 0) {
			System.out.println("O número é par e negativo");
		}
		if (n1 % 2 == 0 && n1 > 0) {
			System.out.println("O número é par e positivo");
		} 
		if (n1 == 0) {
			System.out.println("O número é zero.");
		}

	}

}
