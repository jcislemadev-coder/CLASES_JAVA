package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {
		
		Vehiculo v;
		
		 v = new Vehiculo();
		 
		 System.out.println("======Vehiculo 1: Creado======");
		 
		 System.out.println("Hola Mundo");
		 System.out.println("Marca: " + v.getMarca());
		 System.out.println("Modelo: "+v.getModelo());
		 System.out.println("Año: "+v.getAnio());
		 
		 v.setMarca("Chevrolet");
		 v.setModelo("Alto");
		 v.setAnio("2027");
		 
		 System.out.println("======Vehiculo 1: Valores asignados======");
		 
		 System.out.println("Marca: " + v.getAnio());
		 System.out.println("Modelo: "+v.getModelo());
		 System.out.println("Año: "+v.getAnio());
		 
		 
		 System.out.println("======Vehiculo 2: Creado=========");
		 
		 Vehiculo v2 = new Vehiculo ();
		
		 v2.setMarca("Kia");
		 v2.setModelo("Picanto");
		 v2.setAnio("2026");
		 
		 System.out.println("======Vehiculo 2: Valores asignados=====");
		 System.out.println("Marca: "+ v2.getMarca());
		 System.out.println("Modelo: "+ v2.getModelo());
		 System.out.println("Modelo: "+ v2.getAnio());
		 
		 
		 Vehiculo v3 = new Vehiculo ("Kiaa");
		 System.out.println("La marca del vehiculo del mc: "+ v3.getMarca());
		 Vehiculo v4 = new Vehiculo ("El mas rapido", "Potente", "2027", 400);
		 System.out.println("Marca: "+ v4.getMarca());
		 System.out.println("Modelo: "+ v4.getModelo());
		 System.out.println("Precio: "+ v4.getValor());

	}

}
