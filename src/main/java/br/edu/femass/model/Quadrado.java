package br.edu.femass.model;

public class Quadrado {
    protected Reta lado;

    public Quadrado(Reta lado) {
        this.lado = lado;
    }

    public Reta getLado() {
        return lado;
    }

    /*
     TODO Testar a área de um quadrado
     usem o lado com o mesmo tamanho usado no teste 
     distância entre dois pontos (Classe Ponto)
     */
    public Double getArea() {
        return Math.pow(
            this.lado.getTamanho(),
            2
        );
    }

    /*
    TODO Testar o perímetro 
    siga as instruções do getArea()
     */    
    public Double getPerimetro() {
        return this.lado.getTamanho() * 4.0;
    }
    
}
