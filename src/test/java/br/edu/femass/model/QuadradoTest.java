package br.edu.femass.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuadradoTest {

    @Test
    void testeGetArea(){
        Reta lado = new Reta(0.0, 0.0, 5.0, 0.0);
        Quadrado q = new Quadrado(lado);

        assertEquals(25.0, q.getArea());
    }
    
    @Test
    void testGetPerimetro() {
        Reta lado = new Reta(0.0, 0.0, 5.0, 0.0);
        Quadrado q = new Quadrado(lado);

        assertEquals(20.0, q.getPerimetro());
    }

    
}
