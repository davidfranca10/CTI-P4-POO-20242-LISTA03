package br.edu.principal;

import java.util.Scanner;

import br.edu.util.transformacao;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int seg;
		
		System.out.println("Digite quantos segundos desejar.");
		seg = sc.nextInt();
		
		transformacao.convi(seg);
		
	}

}
