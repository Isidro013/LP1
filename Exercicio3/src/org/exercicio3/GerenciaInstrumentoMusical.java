package org.exercicio3;

public class GerenciaInstrumentoMusical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstrumentoMusical i1 = new InstrumentoMusical("Violão", "Cordas", "Grécia Antiga");
		i1.setValor(250);
		i1.setMarca("Gianini");
		i1.status();
		i1.linha();
		
		InstrumentoMusical i2 = new InstrumentoMusical("Harmônica", "Sopro", "China");
		i2.setValor(50000);
		i2.setMarca("Hohner");
		i2.status();
		i2.linha();
		
		InstrumentoMusical i3 = new InstrumentoMusical("Bateria", "Tambores", "USA");
		i3.setValor(3000);
		i3.setMarca("Tama");
		i3.status();
		i3.linha();
		
		InstrumentoMusical i4 = new InstrumentoMusical("Flauta", "Aerofone", "Alemanha");
		i4.setValor(187000);
		i4.setMarca("Powell");
		i4.status();
		i4.linha();
		
		InstrumentoMusical i5 = new InstrumentoMusical("Piano", "Cordas Percussivas", "Itália");
		i5.setValor(1200000);
		i5.setMarca("Bösendorfer");
		i5.status();
		i5.linha();
	}

}
