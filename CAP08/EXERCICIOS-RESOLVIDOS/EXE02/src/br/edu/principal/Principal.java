package br.edu.principal;
import java.util.Scanner;
import br.edu.util.soma;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		System.out.println("Digite o primeiro número: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = sc.nextInt();
		
		if (n2 < n1) {
			System.out.println("O primeiro número tem que ser maior.");
			return;
		}
		else if (n1==n2) {
			System.out.println("Digite números diferentes");
		}
		else if (n2 == n1+1) {
			System.out.println("A soma dos números entre "+n1+" e "+n2+" é 0");
		}
		else {
			int result = soma.entre(n1, n2);
			System.out.println("A soma dos números entre "+n1+" e "+n2+" é "+result);
		}
	}


}
