package Ex1;

public class UtilizandoClasse {

	public static void main(String[] args) {
		
		//Variaveis que serão parametros do metodo construtor
		        String nome = "Maria dos Santos";
				String email = "maria@gmail.com";
				String telefone = "2255-9999";
				
				//Instanciando (criando o obj)
				
				Pessoa  cadpessoa = new Pessoa (nome,email,telefone);
                cadpessoa.mostrarcadastro();
	}

}
