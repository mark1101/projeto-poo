/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Embaralha;

import trabalhopoo.Modificador;

public class Inverte implements Modificador {

    String saida = "";

    public String Muda(String palavra) {
        for (int i = palavra.length() - 1; i >= 0; i--) {
            saida = saida + palavra.charAt(i);
        }
        System.out.println(saida);
        System.out.println("inverte");

        return saida;
    }
    public String getPalavra() {
        return saida;
    }

    
}
