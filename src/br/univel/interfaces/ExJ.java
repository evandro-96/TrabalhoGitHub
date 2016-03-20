package br.univel.interfaces;

class ExJ implements Desenho {

	public static int SIZE = 13;
	
	@Override
	public void desenhar() {
		
		System.out.println("\n\nj)\n\n");
		
		for (int linha = 0; linha < SIZE; linha++) {
			for (int col = 0; col < SIZE; col++) {
				System.out.print(col < linha || col >= SIZE - linha ? " " : "#");
			}
			System.out.print("\n");
		}
	}
	
	
//	public static void main(String[] args) {
//		
//		int a = 2;
//		int b = 3;
//		
//		if ( a > b) {
//			System.out.println("maior");
//		} else {
//			System.out.println("menor");
//		}
//		
//		
//		System.out.println(a > b ? "maior" : "menor");
//	}
}