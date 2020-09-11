package org.exercicio3;

public class InstrumentoMusical {
	
	//Atributos
	public String nome;
	public String tipo;
	private float valor;
	private String marca;
	private String origem;
	
	//Construtor
	public InstrumentoMusical(String n, String t, String or){
		this.nome = n;
		this.tipo = t;
		this.origem = or;
	}
	
	//Método acessor Set
	public void setNome(String n) {
		this.nome = n;
	}
	
	public void setTipo(String t) {
		this.tipo = t;
	}
	
	public void setValor(float v) {
		this.valor = v;
	}
	
	public void setMarca(String m) {
		this.marca = m;
	}
	
	public void setOrigem(String or) {
		this.origem = or;
	}
	
	//Método acessor Get
	public String getNome() {
		return nome;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public float getValor() {
		return valor;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getOrigem() {
		return origem;
	}
	
	//Status
	public void status() {
		System.out.println("Descrição do Instrumento:");
		System.out.println("Nome:" + this.getNome());
		System.out.println("Tipo:" + this.getTipo());
		System.out.println("Valor:" + this.getValor());
		System.out.println("Marca:" + this.getMarca());
		System.out.println("Origem:" + this.getOrigem());
	}
	
	//Linha de Separação
	public void linha() {
		System.out.println("------------------------------");
	}
}
