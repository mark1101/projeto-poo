/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Embaralha.BaguncaPar;
import Embaralha.EmbaralhaLista;
import Embaralha.Inverte;
import java.util.Random;

public class ConjuntoPalavras {
    private String[] palavra = {"abacate", "jogador", "calopsita", "brasileiro",
            "prateleira", "liquidificador", "salgadinho", "atendimento", "melancia", "especial"};
    EscolheMetodo escolhe = new EscolheMetodo();
    
    public String EscolhaPalavra(int numero) {
        escolhe.Escolhe(palavra[numero]);
        return palavra[numero];
    }
    
    
}
