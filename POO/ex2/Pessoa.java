package ex2;

public class Pessoa {
//Atributo
	private String nome;
	private int anonace;
	
	
	//metodo construtor
	public Pessoa (String nome, int anonace)
	{
		this.nome = nome;
		this.anonace = anonace;
		
	}

	// getter e setter

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getAnonace() {
		return anonace;
	}


	public void setAnonace(int anonace) {
		this.anonace = anonace;
	}
	
	//metodo calc idade
	public void calcidade()
	{
		int resultado=0;
		int anoAtual = 2020;
		int nace = getAnonace();
		int cinquenta = 50;
		
		resultado = (anoAtual - nace) + cinquenta ;
		
		System.out.println(getNome()+", sua idade daqui 50 anos será: "+ resultado);
	}
	
	
	
	
	
	
	
	
	//fim da classe pessoa
}
