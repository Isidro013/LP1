package org.exercicio3;

public class GerenciaPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa("Isidro", "Masculino");
		p1.setIdade(28);
		p1.cor = "Branco";
		p1.setProfissao("Programador");
		p1.status();
		p1.linha();
		
		Pessoa p2 = new Pessoa("Betsy", "Feminino");
		p2.setIdade(54);
		p2.cor = "Branco";
		p2.setProfissao("Cozinheira");
		p2.status();
		p2.linha();
		
		Pessoa p3 = new Pessoa("Débora", "Feminino");
		p3.setIdade(24);
		p3.cor = "Branco";
		p3.setProfissao("Enfermeira");
		p3.status();
		p3.linha();
		
		Pessoa p4 = new Pessoa("Jimy", "Masculino");
		p4.setIdade(40);
		p4.cor = "Negro";
		p4.setProfissao("Guitarrista");
		p4.status();
		p4.linha();
		
		Pessoa p5 = new Pessoa("Kenzo", "Masculino");
		p5.setIdade(5);
		p5.cor = "Amarelo";
		p5.setProfissao("Sem Profissão");
		p5.status();
		p5.linha();
		
	}

}
