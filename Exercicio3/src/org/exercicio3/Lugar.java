package org.exercicio3;

public class Lugar {
	
		public String nome; 
		public String país; 
		private String clima; 
		public int populacao;
		private String continente;
		private boolean ensolarado;
				
		public Lugar(String n, String p, String co, boolean en){
			this.previsaoSol();
			this.nome= n;
			this.país = p;
			this.continente = co;
			this.ensolarado = en;
			
		}
		
		public String getNome() {
			return this.nome;
		}
				
		public void setNome(String n) {
			this.nome = n;
		}
		
		public String getPaís() {
			return this.país;
		}
		
		public void setPaís(String p) {
			this.país = p;
		}
		
		public String getClima() {
			return this.clima;
			}
				
		public void setClima(String c) {
			this.clima = c;
		}
		
		public int getPopulacao() {
			return this.populacao;
		}
		
		public void setPopulacao(int po) {
			this.populacao = po;
		}
		
		public void previsaoSol(){
			this.ensolarado = true;
		}
		
		public void previsaoSemSol() {
			this.ensolarado = false;
		}
		
		public void setContinente(String co) {
			this.continente = co;
		}
				
		public String getContinente() {
			return this.continente;
		}
		
		public void status() {
			System.out.println("Descrição do Local");
			System.out.println("Nome: " + this.getNome());
			System.out.println("País: " + this.getPaís());
			System.out.println("Clima: " + this.getClima());
			System.out.println("População: " + this.populacao);
			System.out.println("Previsão para o Final de Semana: " + this.ensolarado);
		}
		
		public void linha() {
			System.out.println("------------------------------");
		}
}
