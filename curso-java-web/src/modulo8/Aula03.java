package modulo8;

public class Aula03 {

	public static void main(String[] args) {

		int nota1 = 100;
		int nota2 = 100;
		int nota3 = 100;
		int nota4 = 100;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		// Opera��es l�gicas aninhadas: S�o opera��es dentro de opera��es

		if (media >= 50) {
			if (media >= 70) {
				if (media == 100) {
					System.out.println("APROVADO COM 10 PARAB�NS");
				} else {
					System.out.println("Aprovado");
				}
			} else {
				System.out.println("Recupera��o");
			}
		} else {
			System.out.println("Reprovado");
		}
	}
}
