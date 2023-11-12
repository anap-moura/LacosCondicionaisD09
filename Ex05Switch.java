package CanvasD9;

import java.util.Scanner;

public class Ex05Switch {

	public static void main(String[] args) {
	int codigoProduto;
	String nomeProduto = "";
	float valorProduto = 0;
	
	
	Scanner leia = new Scanner (System.in);
	System.out.println("Digite o Código do produto:");
	codigoProduto = leia.nextInt();
	System.out.println("Digite a quantidade desejada do produto:");
	int quant = leia.nextInt();
	
	switch (codigoProduto) {
	case 1:
		valorProduto = 10;
		nomeProduto = "Cachorro Quente";
		break;
	case 2:
		valorProduto = 15;
		nomeProduto = "X-Salada";
		break;
	case 3:
		valorProduto = 18;
		nomeProduto = "X-Bacon";
		break;
	case 4:
		valorProduto = 12;
		nomeProduto = "Bauru";
		break;
	case 5:
		valorProduto = 8;
		nomeProduto = "Refrigerante";
		break;
	case 6:
		valorProduto = 13;
		nomeProduto = "Suco Natural";
		break;
	default:
		System.out.println("Código Inválido.");
	}
	
	float valorTotal = quant*valorProduto;
	System.out.println("Produto:"+nomeProduto);
	System.out.println("Valor total da compra:" +valorTotal);
	
	}

}
