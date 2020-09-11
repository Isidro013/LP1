package org.exercicio3;

public class GerenciaAlunoFtcSjc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlunosFtcSjc a1 = new AlunosFtcSjc("Lucas", "Banco de Dados", 8f);
		a1.idade = 20;
		a1.setPeriodo("Noturno");
		a1.status();
		a1.media();
		a1.linha();
		
		AlunosFtcSjc a2 = new AlunosFtcSjc("Andreia", "ADS", 6.5f);
		a2.idade = 35;
		a2.setPeriodo("Diurno");
		a2.status();
		a2.media();
		a2.linha();
		
		AlunosFtcSjc a3 = new AlunosFtcSjc("Marcos", "Banco de dados", 9f);
		a3.idade = 28;
		a3.setPeriodo("Noturno");
		a3.status();
		a3.media();
		a3.linha();
		
		AlunosFtcSjc a4 = new AlunosFtcSjc("Gabriel", "Banco de Dados", 10f);
		a4.idade = 30;
		a4.setPeriodo("Noturno");
		a4.status();
		a4.media();
		a4.linha();
		
		AlunosFtcSjc a5 = new AlunosFtcSjc("Marcondes", "ADS", 5.5f);
		a5.idade = 25;
		a5.setPeriodo("Diurno");
		a5.status();
		a5.media();
		a5.linha();

	}

}
