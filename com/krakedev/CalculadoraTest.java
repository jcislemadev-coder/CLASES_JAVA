package com.krakedev;

public class CalculadoraTest {

	public static void main(String[] args) {

		Calculadora c1;

		c1 = new Calculadora();

		int r1 = c1.sumar(5, 4);

		System.out.println("El resultado de la suma es: " + r1);

		int r2 = c1.resta(5, 6);

		System.out.println("El resultado de la resta es: " + r2);

		double r3 = c1.multiplicacion(5.8, 6);
		System.out.println("El producto es: " + r3);
		
		double r4 = c1.division(10, 2);
		System.out.println("El resultado de la division es: "+ r4);
		
		double r5 = c1.promedio(10, 8, 9);
		System.out.println("El resultado del promedio es: "+ r5);
		
		c1.mostrarResultado();
		
		
		Calculadora c2 = new Calculadora();
		
		double descuento = c2.descuento(100, 5);
		System.out.println("El descuento es de: "+ descuento);
		
	}

}
