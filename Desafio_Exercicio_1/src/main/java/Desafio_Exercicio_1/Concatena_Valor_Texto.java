
package Desafio_Exercicio_1;

import java.util.List;


public class Concatena_Valor_Texto {
    
    public String concatena(List<Double> valores){        
        String saida = "";
        for (int i = 0; i < valores.size(); i++) {
            
            if(i == valores.size()-1){
                saida += "e " + (i+1) + " cujo valor é R$ " + valores.get(i);
            }else{
                if(i == valores.size()-2){
                    saida += (i+1) + " cujo valor é R$ " + valores.get(i) + " ";
                }else{
                    saida += (i+1) + " cujo valor é R$ " + valores.get(i) + ", ";
                }
            }
        }        
        return saida.replace(".", ",");
    }
}
