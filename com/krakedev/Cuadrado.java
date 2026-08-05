package com.krakedev;

public class Cuadrado {
	private int lado;
	
	public Cuadrado(int lado) {
		this.lado = lado;
		System.out.println("El constructor ha sido creado");
	}
	public int getLado () {
		return lado;
	}
	
	public void setLado (int lado) {
		this.lado = lado;
	}
	
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
