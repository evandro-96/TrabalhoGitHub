package br.univel.interfaces;

import br.univel.classeabstrata.DesenhoAbstrato;

// public class ExM implements Desenho {
public class ExM extends DesenhoAbstrato {

	public static int SIZE = 8;
	

	
	@Override
	public void desenhar() {
		
		identificar();
		
//		System.out.println("=====================================");
//		System.out.println("\n\nm)\n\n");
//		System.out.println("=====================================");
		
		for (int linha = 1; linha <= SIZE; linha++) {
			for (int col = 1; col <= SIZE; col++) {
				if (col > linha) {
					System.out.print(" ");
				} else {
					System.out.print(col + " ");
				}
			}
			System.out.print("\n");
		}
	}
	
	
	@Override
	protected String getNome() {
		return "m";
	}


}