package org.exercicio3;

public class Pessoa {
	
	public String nome;
	public String sexo;
	private int idade;
	public String cor;
	private String profissao;
	
	public Pessoa(String n, String s) {
		this.nome = n;
		this.sexo = s;
	}
	
	//M�todo Acessor Set
	
	public void setNome(String n) {
		this.nome = n;
	}
	
	public void setSexo(String s) {
		this.sexo = s;
	}
	
	public void setIdade(int i) {
		this.idade = i;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setProfissao(String pro) {
		this.profissao = pro;
	}
	
	//M�todo Acessor Get
		
	public String getNome() {
		return nome;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getCor() {
		return cor;
	}
	
	public String getProfissao() {
		return profissao;
	}
			
	//Status
	public void status() {
		
		System.out.println("Dados Pessoais:");
		System.out.println("Nome: "+ this.getNome());
		System.out.println("Sexo: "+ this.getSexo());
		System.out.println("Idade: "+ this.getIdade());
		System.out.println("Cor/Ra�a: "+ this.cor);
		System.out.println("Profiss�o: "+ this.getProfissao());
		
	}
	
	//Separador de Texto
	public void linha() {
		System.out.println("------------------------------");
	}
}
