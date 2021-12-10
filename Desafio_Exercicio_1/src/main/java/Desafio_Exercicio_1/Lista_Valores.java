
package Desafio_Exercicio_1;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import static java.util.Locale.setDefault;
import java.util.Random;
import java.util.Scanner;


public class Lista_Valores {
    public List<Double> valores = new ArrayList();
    private double valorEntrada = 1.0, somaValores = 0.0;                       
    private String retornoSaida = "";
    private Scanner ler = new Scanner(System.in);
    private Random random = new Random();   
    private DecimalFormat formatar = new DecimalFormat("#,##0.00", new DecimalFormatSymbols ());
   
    public String recebe_valores_aleatorios(){
        limpa_variaveis();
        setDefault(new Locale("pt", "BR"));
        for (int i = 0; i < 5; i++) {            
            valores.add(Double.parseDouble(formatar.format(random.nextDouble()*500).replaceAll(",", ".")));
            somaValores += valores.get(i);
        }        
        
        retornoSaida = monta_string(somaValores);
        return retornoSaida;
    }
    
    public String recebe_valores_usuario(){        
        limpa_variaveis();
        System.out.println("\nOBS: Para concluir a inserção de valores, informe 0(zero).\n\nInforme valores: \n");
        
        while(valorEntrada != 0.0){
            valorEntrada = Double.parseDouble(ler.nextLine());
            if(valorEntrada != 0){
                valores.add(valorEntrada);
                somaValores += valorEntrada;
            }
        }
        retornoSaida = monta_string(somaValores);
        return retornoSaida;
    }
    private String monta_string(Double soma){
        setDefault(new Locale("pt", "BR"));
        String saidaFinal = "";
        Concatena_Valor_Texto concatenaTextoValor = new Concatena_Valor_Texto();
        
        saidaFinal = concatenaTextoValor.concatena(valores);
        
        saidaFinal += ". Total = R$ "+ formatar.format(soma);
        return saidaFinal;               
    }
    
    private void limpa_variaveis(){
        valores.clear();
        valorEntrada = 1;
        somaValores = 0.0;
        retornoSaida = "";
    }
}
