package com.krakedev;

public class RectanguloTest {

	public static void main(String[] args) {
		Rectangulo r1;

		r1 = new Rectangulo(5,4);

		int resultadoarea;

		resultadoarea = r1.calcularArea();
		System.out.println("El resultado es: " + resultadoarea);

		double resultadoperimetro;

		resultadoperimetro = r1.calcularPerimetro();
		System.out.println("El perimetro es: " + resultadoperimetro);

		Rectangulo r2 = new Rectangulo(8,2);

		int resultador2;
		double perimetro2;

		resultador2 = r2.calcularArea();
		perimetro2 = r2.calcularPerimetro();

		System.out.println("El resultado del segundo rectangulo es: " + resultador2);
		System.out.println("El perimetro es: " + perimetro2);
		
	}

}
