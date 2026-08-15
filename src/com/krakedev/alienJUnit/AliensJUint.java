package com.krakedev.alienJUnit;

import org.junit.jupiter.api.Test;

import com.krakedev.alien.Aliens;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AliensJUint {
	@Test
	public void miPrimeraPueba() {
		Aliens alien1 = new Aliens(10, "verde");
		assertEquals("verde", alien1.getColor());	
	}
	@Test
	public void miSegundaPrueba() {
		Aliens alien2 = new Aliens(2,"rosa");
		assertEquals(5, alien2.getTamanio());
	}
	@Test
	public void miTerceraPrueba() {
		Aliens alien3 = new Aliens(8, "Azul");
		assertEquals(1.6, alien3.getPrecioCuerpo(),0.001);
	}
	@Test
	public void  miCuartaPrueba() {
		Aliens aliens4 = new Aliens(6, "Violeta");
		assertEquals(0.6, aliens4.getPrecioExtremidad(), 0.001);
	}
	@Test
	public void miQuintaPrueba() {
		Aliens aliens5 = new Aliens(45, "rojo");
		assertEquals(1.5, aliens5.getPrecioOjo(), 0.001);
	}
}
