package br.com.db1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExercicioDeColecao {

	public static void main(String[] args) {
		exercicio2();
	}


	public static Integer exercicio2() {
		List<String> nomes = new ArrayList<String>();
		nomes.add("Fusca");
		nomes.add("Mariah");

		for(Integer x = 0; x < nomes.size(); x++){
			System.out.println(nomes.get(x));
		}
		
		for(String valorUnitario : nomes){
			System.out.println(valorUnitario);
		}
		
		
		List<Integer> exemploNumeros = new ArrayList<Integer>();
		exemploNumeros.add(9);
		exemploNumeros.add(15);
		exemploNumeros.add(14);
		
		System.out.println(exemploNumeros);
		
		Collections.sort(exemploNumeros);
		Collections.reverse(exemploNumeros);
		
		for(Integer a : exemploNumeros){
			System.out.println(a);		
		}
		
		
		
		return nomes.size();
	}
	
}
