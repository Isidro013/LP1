package org.exercicio3;

public class GerenciaLugar {

	public static void main(String[] args) {
		Lugar local1 = new Lugar("Caçapava", "Brasil", "America do Sul", true);
		local1.setClima("Tropical");
		local1.populacao = 92000;
		local1.status();
		local1.linha();
		
		Lugar local2 = new Lugar("Nova York", "USA", "América do Norte", false);
		local2.setClima("Temperado");
		local2.populacao = 8800000;
		local2.status();
		local2.linha();
		
		Lugar local3 = new Lugar("Moscou", "Russia", "Eurásia", false);
		local3.setClima("Polar");
		local3.populacao = 11000000;
		local3.status();
		local3.linha();
		
		Lugar local4 = new Lugar("Sidney", "Austrália", "Oceania", true);
		local4.setClima("Subtropical úmido");
		local4.populacao = 5131326;
		local4.status();
		local4.linha();
		
		Lugar local5 = new Lugar("Santorini", "Grécia", "Europa", true);
		local5.setClima("Mediterrâneo");
		local5.populacao = 15550;
		local5.status();
		local5.linha();
	}

}
