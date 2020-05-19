package Ex1;

public class Pessoa {
	
	//Atributos
private String nome ;
private String email ;
private String telefone ;

// Metodo construtor

public Pessoa (String nome, String email, String telefone)
{
this.nome = nome;
this.email = email;
this.telefone = telefone;
}

// Getters e Setters

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getTelefone() {
	return telefone;
}

public void setTelefone(String telefone) {
	this.telefone = telefone;
}

// metodo imprimir
public void mostrarcadastro()
{
	System.out.println("O nome cadastrado é: " + getNome()+ ",o E-mail: "+getEmail()+" e seu Telefone: "+getTelefone());
}

//Fim da classe
}
