package com.krakedev;

public class Mensajeria {
	
	public Mensajeria() {
		System.out.println("Este es el constructor vacio");
	}
	
	public void saludar () {
		
		System.out.println("Hola como están");
	}
	
	public void saludarpersona (String nombre, String apodo) {
		
		System.out.println("Hola "+ nombre+ " tu apodo es: "+ apodo);
	}
}
