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
		System.out.println("Profiss�es:");
		System.out.println("Nome: " + this.getNome());
		System.out.println("M�dia Salarial: " + this.getMediaSalarial());
		System.out.println("�rea e Atua��o: " + this.getAreaAtuacao());
		System.out.println("Carga Hor�ria: " + this.getCargaHoraria());
	}
	
	public void linha() {
		System.out.println("------------------------------");
	}

}
