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

}
