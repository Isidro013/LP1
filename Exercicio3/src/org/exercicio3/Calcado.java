package org.exercicio3;

public class Calcado {
	
	public String marca;
	public String cor;
	public String modelo;
	public int tamanho;
	private float preco;
	private String categoria;
	
	
	public Calcado(String marca, String modelo, int tamanho) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.tamanho = tamanho;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public void status() {
		System.out.println("Descrição do Calçado");
		System.out.println("Marca: " + this.getMarca());
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Tamanho: " + this.getTamanho());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Preço: " + this.getPreco());
		System.out.println("Categoria: " + this.getCategoria());
		
	}
	
	public void linha() {
		System.out.println("------------------------------");
	}
}
