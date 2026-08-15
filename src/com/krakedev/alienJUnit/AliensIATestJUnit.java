/*Pruebas con IA: "La clase Aliens tiene un constructor que recibe tamanio y color. Si el tamaño es 
 *menor a 5, se ajusta a 5. Si es mayor a 30, se ajusta a 30. Si está entre 5 y 30, se queda igual.
 *Además, el constructor calcula tres precios a partir del tamaño ya ajustado: precioCuerpo es el
 *20% del tamaño, precioExtremidad es el 10% del tamaño, y precioOjo es el 5% del tamaño."*/

package com.krakedev.alienJUnit;

import org.junit.jupiter.api.Test;
import com.krakedev.alien.Aliens;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AliensIATestJUnit {

	@Test
	public void tamanioDentroDeRangoSeMantieneIgual() {
	    // Creamos un alien con tamanio = 15, que YA está dentro del rango permitido (5-30)
	    Aliens alien = new Aliens(15, "verde");
	    // Como 15 ya es válido, no debería ajustarse a nada, se espera que se quede en 15
	    assertEquals(15, alien.getTamanio());
	}

	@Test
	public void tamanioMenorAlMinimoSeAjustaA5() {
	    // Creamos un alien con tamanio = 1, que está POR DEBAJO del mínimo permitido (5)
	    Aliens alien = new Aliens(1, "azul");
	    // Como 1 es menor a 5, el constructor debe corregirlo automáticamente a 5
	    assertEquals(5, alien.getTamanio());
	}

	@Test
	public void tamanioIgualAlMinimoSeMantieneEn5() {
	    // Creamos un alien con tamanio = 5, que es EXACTAMENTE el límite mínimo permitido
	    Aliens alien = new Aliens(5, "rojo");
	    // Como 5 ya es un valor válido (el mínimo exacto), no debería cambiar, sigue siendo 5
	    assertEquals(5, alien.getTamanio());
	}

	@Test
	public void tamanioMayorAlMaximoSeAjustaA30() {
	    // Creamos un alien con tamanio = 100, que está POR ENCIMA del máximo permitido (30)
	    Aliens alien = new Aliens(100, "negro");
	    // Como 100 es mayor a 30, el constructor debe corregirlo automáticamente a 30
	    assertEquals(30, alien.getTamanio());
	}

	@Test
	public void tamanioIgualAlMaximoSeMantieneEn30() {
	    // Creamos un alien con tamanio = 30, que es EXACTAMENTE el límite máximo permitido
	    Aliens alien = new Aliens(30, "blanco");
	    // Como 30 ya es un valor válido (el máximo exacto), no debería cambiar, sigue siendo 30
	    assertEquals(30, alien.getTamanio());
	}

    @Test
    public void colorSeAsignaCorrectamente() {
        Aliens alien = new Aliens(10, "amarillo");
        assertEquals("amarillo", alien.getColor());
    }

    @Test
    public void precioCuerpoEs20PorCientoDelTamanio() {
        Aliens alien = new Aliens(20, "gris");
        assertEquals(4.0, alien.getPrecioCuerpo(), 0.001);
    }

    @Test
    public void precioExtremidadEs10PorCientoDelTamanio() {
        Aliens alien = new Aliens(20, "gris");
        assertEquals(2.0, alien.getPrecioExtremidad(), 0.001);
    }

    @Test
    public void precioOjoEs5PorCientoDelTamanio() {
        Aliens alien = new Aliens(20, "gris");
        assertEquals(1.0, alien.getPrecioOjo(), 0.001);
    }

    @Test
    public void preciosSeCalculanConTamanioYaAjustado() {
        // tamanio=2 se ajusta a 5, los precios deben calcularse con 5, no con 2
        Aliens alien = new Aliens(2, "morado");
        assertEquals(1.0, alien.getPrecioCuerpo(), 0.001);
        assertEquals(0.5, alien.getPrecioExtremidad(), 0.001);
        assertEquals(0.25, alien.getPrecioOjo(), 0.001);
    }
}