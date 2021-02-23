/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooaula1;

/**
 *
 * @author filip
 */
public class Lampada {

    private boolean ligada;
    private int potencia;

    public void ligar() {

    };
   public void desligar() {

    };   
   
   public boolean estaLigada() {
        return ligada;
    }

    public int verificarPotencia() {
        return potencia;
    }

    public void alterarPotencia(int novaPotencia) {
        potencia = novaPotencia;
    }

}
