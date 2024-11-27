package br.edu.util;

public class calcular {

	public static double reajuste(double antigo, double atual) {
		double result;
		
		result = (100*atual - 100*antigo)/antigo;
		return result;
		
	}
}
