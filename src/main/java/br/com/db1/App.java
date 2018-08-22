package br.com.db1;

import br.com.db1.oo.Cidade;
import br.com.db1.oo.Endereco;
import br.com.db1.oo.Pessoa;
import br.com.db1.oo.PessoaFisica;
import br.com.db1.oo.PessoaJuridica;
import br.com.db1.oo.RecFederal;
import br.com.db1.oo.Telefone;
import br.com.db1.type.TipoLogradouro;
import br.com.db1.type.TipoTelefone;
import br.com.db1.type.Uf;


public class App {
	public static void main(String[] args) {
		Cidade cidade = new Cidade();
		cidade.setNome("Maringá");
		cidade.setUf(Uf.PR);
		
		Endereco endereco = new Endereco();
		endereco.setTipoLogradouro(TipoLogradouro.AVENIDA);
		endereco.setLogradouro("Guedner");
		endereco.setNumero("S/N");
		endereco.setBairro("Jardim Aclimação");
		endereco.setCep(87000000);
		endereco.setCidade(cidade);
		
		Pessoa p = new Pessoa();
		p.setNome("Marcel");
		p.setEndereco(endereco);
		
		Telefone telefone = new Telefone();
		telefone.setDdd(44);
		telefone.setNumero(99991111);
		telefone.setTipo(TipoTelefone.CELULAR);
		
		p.addTelefone(telefone);
		
		telefone = new Telefone();
		telefone.setDdd(44);
		telefone.setNumero(999999999);
		telefone.setTipo(TipoTelefone.REFERENCIA);
		p.addTelefone(telefone);
		
		Pessoa pfHeranca = new PessoaFisica();
		Pessoa pjHeranca = new PessoaJuridica();
		
		RecFederal pf = new PessoaFisica();
		RecFederal pj = new PessoaJuridica();
		RecFederal end = new Endereco();
		pf.codigoDaDeclaracaoDoImpostoDeRenda();
		pj.codigoDaDeclaracaoDoImpostoDeRenda();
		end.codigoDaDeclaracaoDoImpostoDeRenda();

	}

	private static void fundamentosJava(){
    /*        
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
        
*/     
    }
}

