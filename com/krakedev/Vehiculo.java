package com.krakedev;

public class Vehiculo {
	private String marca;
	private String modelo;
	private String anio;
	private double valor;
	
	public String getMarca () {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getAnio() {
		return anio;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setMarca( String marca) {
		this.marca = marca;
	}
	
	public void setModelo (String modelo) {
		this.modelo = modelo;
	}
	
	public void setAnio (String anio) {
		this.anio = anio;
	}
	
	public void setValor (double valor) {
		this.valor = valor;
	}
}
