package br.univel.interfaces;

class ExF implements Desenho {

	public static int ALTURA = 8;

	@Override
	public void desenhar() {

		System.out.println("f)\n\n");

		int traco = 0;
		for (int linha = 0; linha < 8; linha++) {
			for (int coluna = 0; coluna < ALTURA; coluna++) {
				if (linha == 0 || linha == ALTURA - 1 || coluna == traco) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			traco++;
			System.out.print("\n");
		}
	}
}
