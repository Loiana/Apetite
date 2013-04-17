/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.lacunas;

/**
 *
 * @author Loiana
 */
public class GeradorDeNomeDeReceitas {
    static private String[] radicais = {
       "Cufa",
       "Bolo",
       "Pudim",
       "Biscoito",
       "Sorvete",
       "Salada"
    };
 
    static private String[] adjetivos = {
       "Delicioso(a)",
       "de Morango",
       "Cremoso(a)",
       "Leve",
       "Crocante",
       "Quente"
    };
    
    static private String[] caracteristicas = {
        "da Vovó",
        "com Calda",
        "com Frutas"
    };
    
    /**
     * @return [prefixo +]  radical [+ sufixo] [+ adjetivo]
     */
    static public String prox () {
        
        ExpressaoGeradora exp0 = new ExpressaoGeradora(5);
        exp0.colar(new ParteSorteada(radicais));
        exp0.colar(new ParteSorteada(adjetivos));
        exp0.colar(new ParteSorteada(caracteristicas));
              
        ExpressaoGeradora exp1 = new ExpressaoGeradora(2);
        exp1.colar(new ParteSorteada(radicais));
        exp1.colar(new ParteSorteada(radicais));
        
        ExpressaoGeradora exp2 = new ExpressaoGeradora(2);
        exp2.colar(new ParteSorteada(radicais));
        exp2.colar(new ParteSorteada(adjetivos));
        
        ExpressaoGeradora[] p1 = {exp0, exp1, exp2};
        Gerador g1 = new Gerador(p1);
        String parte1 = g1.prox();
        parte1 = parte1.substring(0, 1).toUpperCase() + 
                parte1.substring(1, parte1.length());
        
        return parte1;
    }
}
