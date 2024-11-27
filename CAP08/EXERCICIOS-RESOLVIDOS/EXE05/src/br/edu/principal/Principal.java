package br.edu.principal;

import java.util.Scanner;

import br.edu.util.calcular;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double precoantigo, precoatual, acrescimo;
		
		System.out.println("Preço antigo do produto: ");
		precoantigo = sc.nextDouble();
		System.out.println("Preço atual do produto: ");
		precoatual = sc.nextDouble();
		acrescimo = calcular.reajuste(precoantigo, precoatual);
		System.out.println("O percentual de acréscimo do novo preço em relação ao antogo é de "+acrescimo+"%");
		
	}

}
