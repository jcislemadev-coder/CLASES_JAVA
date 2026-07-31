package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {
		
		Vehiculo v;
		
		 v = new Vehiculo();
		 
		 System.out.println("======Vehiculo 1: Creado======");
		 
		 System.out.println("Hola Mundo");
		 System.out.println("Marca: " + v.marca);
		 System.out.println("Modelo: "+v.modelo);
		 System.out.println("Año: "+v.anio);
		 
		 v.marca = "Chevrolet";
		 v.modelo = "Alto";
		 v.anio = "2027";
		 
		 System.out.println("======Vehiculo 1: Valores asignados======");
		 
		 System.out.println("Marca: " + v.marca);
		 System.out.println("Modelo: "+v.modelo);
		 System.out.println("Año: "+v.anio);
		 
		 
		 System.out.println("======Vehiculo 2: Creado=========");
		 
		 Vehiculo v2 = new Vehiculo ();
		 
		 v2.marca = "Kia";
		 v2.modelo = "Picanto";
		 v2.anio = "2026";
		 
		 System.out.println("======Vehiculo 2: Valores asignados=====");
		 System.out.println("Marca: "+ v2.marca);
		 System.out.println("Modelo: "+ v2.modelo);
		 System.out.println("Modelo: "+ v2.anio);
		 
		 

	}

}
