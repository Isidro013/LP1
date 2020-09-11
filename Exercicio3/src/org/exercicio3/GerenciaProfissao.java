package org.exercicio3;

public class GerenciaProfissao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profissao p1 = new Profissao("Programador", 3000);
		p1.setAreaAtuacao("Tecnologia");
		p1.cargaHoraria = "44 horas semanais";
		p1.status();
		p1.linha();
		
		Profissao p2 = new Profissao("Instrumentação", 3000);
		p2.setAreaAtuacao("Saúde");
		p2.cargaHoraria = "40 horas semanais";
		p2.status();
		p2.linha();
		
		Profissao p3 = new Profissao("Mecênico", 5000);
		p3.setAreaAtuacao("Autmotivo");
		p3.cargaHoraria = "44 horas semanais";
		p3.status();
		p3.linha();
		
		Profissao p4 = new Profissao("Personal Trainer", 1800);
		p4.setAreaAtuacao("Sáude/Bem estar");
		p4.cargaHoraria = "48 horas semanais";
		p4.status();
		p4.linha();
		
		Profissao p5 = new Profissao("Cozinheiro", 2000);
		p5.setAreaAtuacao("Gastronomica");
		p5.cargaHoraria = "44 horas semanais";
		p5.status();
		p5.linha();
	}

}
