package br.com.db1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //int zero = 0;
        Integer zeroObjeto = 0;
        zeroObjeto.doubleValue();
        zeroObjeto.toString();
               
        
        char vogal = 'a';
        String vogalString = "a";
        vogalString.trim();
                		
        double umPontoDois = 1.2;
        Double valor =1.2;
        Double valor2 = 2.0;
        Float valor3 = 3f;
        
        BigDecimal dinheiro = BigDecimal.ZERO;
        Dinheiro d = new Dinheiro();
        d.umMetodo();
        
        //---------------
        for (Integer x = 0; x < vogalString.length(); x++){}
        //---------------
        
        Integer x =0;
        while (x<100){        	
        	x++;
        }
        
        //---------------
        do{        	
        } while (x<100);
        
        
        x % 2 == 0 : "eh par" ? "eh impar";
        
        switch (x) {
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("um");
			break;
		case 2:
			System.out.println("dois");
			break;	
		default:
			break;
		}
                
        if(){
        	
        }else if(){
        	
        }else{
        	
        }
        
        int[] matriz = {1,2,3,4};
        int matriz22 = 1;
        
        Integer[] matrizInteger = {1,2,3,4};
        
        List<Integer> valores = new ArrayList<Integer>();
        List<Integer> valoresLinkado = new LinkedList<Integer>();
        
        Set<Integer> valoresNaoRepetidos = new HashSet<Integer>();
        
        Map<String, Integer> nomeDaVariavel = new HashMap<String, Integer>();

        List<String> nomes;
        List<Dinheiro> meuSalario;
        
        
    }
}
