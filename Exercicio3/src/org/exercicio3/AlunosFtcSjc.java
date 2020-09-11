package org.exercicio3;

public class AlunosFtcSjc {
	
	//Atributos
	private String nome;
	private String curso;
	private String periodo;
	public int idade;
	private float media;
	
	//Construtor
	public AlunosFtcSjc(String n, String c, float me) {
		this.nome = n;
		this.curso = c;
		this.media = me;
	}
	
	//Método acessor Set
	
	public void setNome(String n) {
		this.nome = n;
	}
	
	public void setCurso(String c) {
		this.curso = c;
	}
	
	public void setPeriodo(String p) {
		this.periodo = p;
	}
	
	public void setIdade(int i) {
		this.idade = i;
	}
	
	public void setMedia(float me) {
		this.media = me;
	}
	
	//Método acessor Get
	
	public String getNome() {
		return nome;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public String getPeriodo() {
		return periodo;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public float getMedia() {
		return media;
	}
	
	public void status() {
		System.out.println("Ficha do Aluno:");
		System.out.println("Nome: "+ this.getNome());
		System.out.println("Idade:"+ this.getIdade());
		System.out.println("Curso: "+ this.getCurso());
		System.out.println("Período:" + this.getPeriodo());
		System.out.println("Média:" + this.media);
		System.out.println("Situação do Aluno:");
		
	}
	
	public void media() {
		if (media < 6) {
			System.out.println("Aluno Reprovado");
		}else if (media > 6) {
			System.out.println("Aluno Aprovado");
		}
	}
	
	public void linha() {
		System.out.println("------------------------------");
	}
	
}
