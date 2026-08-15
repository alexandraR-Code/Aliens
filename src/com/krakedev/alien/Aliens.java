package com.krakedev.alien;

public class Aliens {
	/*<<Atributos privados >>*/
	private int tamanio;
	private String color;
	private int numeroOjos;
	private int numeroBrazos;
	private int numeroPies;
	private double precioExtremidad;
	private double precioOjo;
	private double precioCuerpo;
	
	/*Constructor que recibe 2 atributos*/
	
	public Aliens(int tamanio, String color) {
		this.color = color;
		if (tamanio < 5) {
		    this.tamanio = 5;
		} else if (tamanio > 30) {
		    this.tamanio = 30;
		} else {
		    this.tamanio = tamanio;
		}
		this.precioCuerpo = this.tamanio * 0.20;
		this.precioExtremidad = this.tamanio * 0.10;
		this.precioOjo = this.tamanio * 0.05;
	}
	
	/*Metodos get*/

	public int getTamanio() {
		return tamanio;
	}

	public String getColor() {
		return color;
	}

	public int getNumeroOjos() {
		return numeroOjos;
	}

	public int getNumeroBrazos() {
		return numeroBrazos;
	}

	public int getNumeroPies() {
		return numeroPies;
	}

	public double getPrecioExtremidad() {
		return precioExtremidad;
	}

	public double getPrecioOjo() {
		return precioOjo;
	}

	public double getPrecioCuerpo() {
		return precioCuerpo;
	}
	/*Metodo imprimir*/
	public void imprimir() {
		System.out.println("Tamaño: " + this.getTamanio());
		System.out.println("Color: " + this.getColor());
		System.out.println("Número de ojos: " + this.getNumeroOjos());
		System.out.println("Número de brazos: " + this.getNumeroBrazos());
		System.out.println("Número de pies: " + this.getNumeroPies());
		System.out.println("Precio por extremidades: " + this.getPrecioExtremidad());
		System.out.println("Precio por ojo: " + this.getPrecioOjo());
		System.out.println("Precio cuerpo: " + this.getPrecioCuerpo());
		
	}
	
	
	

}
