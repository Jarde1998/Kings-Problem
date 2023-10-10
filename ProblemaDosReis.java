
public class ProblemaDosReis {

	public static void main(String[] args) {

		int a = Teclado.leInt("Digite A:");
		int b = Teclado.leInt("Digite B");
		int rei = 0;
		if (a == b || a > b || b > a) {
			
			int comprimento = a;
			int largura = b;
			String[][] tabuleiro = new String[comprimento][largura];
			for (int i = 0; i < tabuleiro.length; i++) {
				for (int j = 0; j < tabuleiro[i].length; j++) {
					tabuleiro[i][j] = "x";
				}
			}

			for (int i = 0; i < tabuleiro.length; i++) {
				for (int j = 0; j < tabuleiro[i].length; j++) {
					tabuleiro[0][0] = "R";
					if (i == 0 && j > 0) {
						if ("x".equals(tabuleiro[0][j - 1])) {
							tabuleiro[0][j] = "R";
						}
					}
					if (i > 0 && j >= 0) {
						if (j == 0) {
							if (tabuleiro[i - 1][j].equals("x")) {
								if (tabuleiro[i - 1][j + 1].equals("x")) {
									tabuleiro[i][j] = "R";
								}
							}
						}
						else if(j > 0 ) {
							if(tabuleiro[i][j-1].equals("x")) {
								if(tabuleiro[i-1][j-1].equals("x")) {
									if(tabuleiro[i-1][j].equals("x")) {
										tabuleiro[i][j] = "R";
									}
								}
							}
						}
						
						
						
						
						
					}

				}
			}

			for (int i = 0; i < tabuleiro.length; i++) {
				for (int j = 0; j < tabuleiro[i].length; j++) {
					if(tabuleiro[i][j] == "R") {
						rei++;
					}
					System.out.print(tabuleiro[i][j] + "\t");
				}
				System.out.println();
			}

		}
		System.out.println("Quantidade de reis: "+rei);

	}

}
