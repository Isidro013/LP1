package org.exercicio3;

public class GerenciaLugar {

	public static void main(String[] args) {
		Lugar local1 = new Lugar("Ca�apava", "Brasil", "America do Sul", true);
		local1.setClima("Tropical");
		local1.populacao = 92000;
		local1.status();
		local1.linha();
		
		Lugar local2 = new Lugar("Nova York", "USA", "Am�rica do Norte", false);
		local2.setClima("Temperado");
		local2.populacao = 8800000;
		local2.status();
		local2.linha();
		
		Lugar local3 = new Lugar("Moscou", "Russia", "Eur�sia", false);
		local3.setClima("Polar");
		local3.populacao = 11000000;
		local3.status();
		local3.linha();
		
		Lugar local4 = new Lugar("Sidney", "Austr�lia", "Oceania", true);
		local4.setClima("Subtropical �mido");
		local4.populacao = 5131326;
		local4.status();
		local4.linha();
		
		Lugar local5 = new Lugar("Santorini", "Gr�cia", "Europa", true);
		local5.setClima("Mediterr�neo");
		local5.populacao = 15550;
		local5.status();
		local5.linha();
	}

}
