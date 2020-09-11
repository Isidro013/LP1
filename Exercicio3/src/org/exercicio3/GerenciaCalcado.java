package org.exercicio3;

public class GerenciaCalcado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calcado cal1 = new Calcado("Nike", "Air", 39);
		cal1.setPreco(600);
		cal1.setCategoria("Esportivo Casual");
		cal1.setCor("Azul");
		cal1.status();
		cal1.linha();
		
		Calcado cal2 = new Calcado("Macboot", "Forest", 42);
		cal2.setPreco(350);
		cal2.setCategoria("Escalada/Trilha");
		cal2.setCor("Couro");
		cal2.status();
		cal2.linha();
		
		Calcado cal3 = new Calcado("Penalti", "Dominio", 40);
		cal3.setPreco(200);
		cal3.setCategoria("Esportivo Futebolistico");
		cal3.setCor("Bracno");
		cal3.status();
		cal3.linha();
		
		Calcado cal4 = new Calcado("Vizzano", "Scarpan", 38);
		cal4.setPreco(200);
		cal4.setCategoria("Social");
		cal4.setCor("Preto");
		cal4.status();
		cal4.linha();
		
		Calcado cal5 = new Calcado("Havaianas", "Chinelo", 40);
		cal5.setPreco(30);
		cal5.setCategoria("Casual");
		cal5.setCor("Branco");
		cal5.status();
		cal5.linha();
	}

}
