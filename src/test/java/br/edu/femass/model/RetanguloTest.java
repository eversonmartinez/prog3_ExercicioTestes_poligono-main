package br.edu.femass.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RetanguloTest {
    @Test
    void testGetArea() {
        Reta lado = new Reta(0.0, 0.0, 5.0, 0.0);
        Reta altura = new Reta(5.0, 0.0, 5.0, 4.0);
        Retangulo r = new Retangulo(lado, altura);

        assertEquals(20.0, r.getArea());
    }

    @Test
    void testGetPerimetro() {
        Reta lado = new Reta(0.0, 0.0, 5.0, 0.0);
        Reta altura = new Reta(5.0, 0.0, 5.0, 4.0);
        Retangulo r = new Retangulo(lado, altura);

        assertEquals(18.0, r.getPerimetro());

    }
}
