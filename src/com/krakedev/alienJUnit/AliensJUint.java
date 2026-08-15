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
	/*========================================================*/
	@Test
	public void agregarBrazosCasoValido() {
	    Aliens alien = new Aliens(10, "verde");
	    boolean resultado = alien.agregarBrazos(3);
	    assertEquals(true, resultado);
	    assertEquals(3, alien.getNumeroBrazos());
	}
	@Test
	public void agregarPiernaCasoValidacion() {
		Aliens alien = new Aliens(5, "Azul");
		boolean resultado = alien.agregarPiernas(8);
		assertEquals(true, resultado);
		assertEquals(8, alien.getNumeroPies());
	}
	@Test
	public void agregarBrazosCasoLimite() {
		Aliens alien = new Aliens(45, "Rosa");
		boolean resultado =  alien.agregarBrazos(11);
		assertEquals(false, resultado);
		assertEquals(0, alien.getNumeroBrazos());
	}
	@Test
	public void agregarPiernaCasoLimite() {
		Aliens aliens = new Aliens(3, "Amarillo");
		boolean resultado = aliens.agregarPiernas(15);
		assertEquals(false, resultado);
		assertEquals(0, aliens.getNumeroPies());
	}
	@Test
	public void agregarCasoCombinado() {
		Aliens aliens = new Aliens(6, "gris");
		boolean resultado = aliens.agregarBrazos(5);
		assertEquals(true, resultado);
		assertEquals(5, aliens.getNumeroBrazos());
		
		boolean resultado1 = aliens.agregarPiernas(5);
		assertEquals(true, resultado1);
		assertEquals(5, aliens.getNumeroPies());	
	}
	@Test
	public void agregarCasoCombinadoLimite() {
		Aliens aliens = new Aliens(10, "verde");
		boolean resultado = aliens.agregarBrazos(4);
		assertEquals(true, resultado);
		assertEquals(4, aliens.getNumeroBrazos());
		
		boolean resultado2 = aliens.agregarPiernas(6);
		assertEquals(true, resultado2);
		assertEquals(6, aliens.getNumeroPies());
		
		boolean resultado3 = aliens.agregarPiernas(2);
		assertEquals(false, resultado3);
		assertEquals(6, aliens.getNumeroPies());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
