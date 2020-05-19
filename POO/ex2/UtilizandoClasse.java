package ex2;

import java.util.Scanner;

public class UtilizandoClasse {

	public static void main (String[] args) {
		
		String nome="";
		int anonace = 0;
		
		Scanner sc =  new Scanner(System.in);
		
		Pessoa minhaIdade = new Pessoa(nome,anonace);
		
		System.out.println("Inform o nome: ");
		nome = sc.nextLine();
		minhaIdade.setNome(nome);
		
		System.out.println("Informe a ano de nascimento: ");
		anonace = sc.nextInt();
		minhaIdade.setAnonace(anonace);
		
		//executando o metodo
		minhaIdade.calcidade();
		
		
		
		
		sc.close();
	}

	}

}
