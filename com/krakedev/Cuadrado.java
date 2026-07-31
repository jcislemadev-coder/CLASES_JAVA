package com.krakedev;

public class Cuadrado {
	public int lado;
	
	public double area () {
		double area;
		area = lado * lado;
		return area;
	}
	
	public double perimetro () {
		double perimetro;
		perimetro = lado *4;
		return perimetro;
	}
}
