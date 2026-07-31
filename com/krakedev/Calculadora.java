package com.krakedev;

public class Calculadora {

	public int sumar(int a, int b) {
		int resultado;
		resultado = a + b;
		return resultado;
	}
	
	public int resta(int a, int b) {
		int resultado;
		resultado = a - b;
		return resultado;
		
	}
	
	public double multiplicacion (double a, double b) {
		double resultado;
		resultado = a*b;
		return resultado;
	}
	
	public double division (double a, double b) {
		double resultado;
		resultado = a/b;
		return resultado;
	}
	
	public double promedio (double a, double b, double c) {
		double resultado;
		resultado = (a+b+c)/3;
		return resultado;
	}
	
	public void mostrarResultado() {
		System.out.println("!!!!!Ahorita no joven, Salí al almuerzo. Regreso en 15 minutos!!!s");
	}
}
