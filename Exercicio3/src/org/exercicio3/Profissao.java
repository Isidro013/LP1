package org.exercicio3;

public class Profissao {
	public String nome;
	public String areaAtuacao;
	private int mediaSalarial;
	public String cargaHoraria;
	
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public Profissao(String nome, int mediaSalarial) {
		super();
		this.nome = nome;
		this.mediaSalarial = mediaSalarial;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAreaAtuacao() {
		return areaAtuacao;
	}
	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}
	public int getMediaSalarial() {
		return mediaSalarial;
	}
	public void setMediaSalarial(int mediaSalarial) {
		this.mediaSalarial = mediaSalarial;
	}
	
	public void status() {
		System.out.println("Profissões:");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Média Salarial: " + this.getMediaSalarial());
		System.out.println("Área e Atuação: " + this.getAreaAtuacao());
		System.out.println("Carga Horária: " + this.getCargaHoraria());
	}
	
	public void linha() {
		System.out.println("------------------------------");
	}

}
