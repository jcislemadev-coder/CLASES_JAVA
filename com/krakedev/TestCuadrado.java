package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado(4);
		double area = c1.area();
		double perimetro = c1.perimetro();
		System.out.println("********PRIMER CUADRADO***********");
		System.out.println("El area del cuadrado es: " + area);
		System.out.println("El perimetro del cuadrdo es: " + perimetro);

		System.out.println("********SEGUNDO CUADRADO***********");
		Cuadrado c2 = new Cuadrado(3);
		double area2 = c2.area();
		double perimetro2 = c2.perimetro();

		System.out.println("El area del cuadrado es: " + area2);
		System.out.println("El perimetro del cuadrado es: " + perimetro2);

		Cuadrado c3 = new Cuadrado(3);

		double area3 = c3.area();
		double perimetro3 = c3.perimetro();

		System.out.println("********TERCER CUADRADO***********");
		System.out.println("El area del 3er cuadrado es: " + area3);
		System.out.println("El perimetro del 3r cuadrado es: " + perimetro3);

	}

}
