package br.edu.femass.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RetaTest {

    @Test
    void testConstrutor2Pontos (){
        Ponto p1 = new Ponto(0.0, 1.0);
        Ponto p2 = new Ponto(2.5, 3.8);
       
        Reta r = new Reta(p1, p2);
        assertEquals(0.0,  r.getP1().getX());
        assertEquals(1.0,  r.getP1().getY());
        assertEquals(2.5, r.getP2().getX());
        assertEquals(3.8, r.getP2().getY());
    };

    @Test
    void testaConstrutor4Pontos(){
        //Ponto p1 = new Ponto(0.0, 0.0);
        //Ponto p2 = new Ponto(2.5, 3.8);
        Reta r = new Reta(0.0, 1.0, 2.5, 3.8);
        assertEquals(0.0, r.getP1().getX());
        assertEquals(1.0, r.getP1().getY());
        assertEquals(2.5, r.getP2().getX());
        assertEquals(3.8, r.getP2().getY());
    }

    @Test
    void testaGetTamanho(){
        Reta r = new Reta(0.0,0.0, 0.0, 5.0);

        assertEquals(5, r.getTamanho());
    }
}
