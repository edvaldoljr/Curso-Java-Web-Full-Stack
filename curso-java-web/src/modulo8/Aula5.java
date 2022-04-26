package modulo8;

public class Aula5 {

	// Operadores relacionais
	public static void main(String[] args) {

		int nota1 = 90;
		int nota2 = 90;

		// == igual
		if (nota1 == nota2) {
			System.out.println("As notas sao iguais!");
		} else {
			System.out.println("As notas são diferentes!");
		}

		// != diferente
		if (nota1 != nota2) {
			System.out.println("As notas sao diferentes!");
		} else {
			System.out.println("As notas são iguais!");
		}

		// < menor
		if (nota1 < nota2) {
			System.out.println("Nota1 menor que nota2");
		} else {
			System.out.println("Nota1 maior que nota2");
		}

		// > maior
		if (nota1 > nota2) {
			System.out.println("Nota1 maior que nota2");
		} else {
			System.out.println("Nota1 menor que nota2");
		}

		// <= menor ou igual
		if (nota1 <= nota2) {
			System.out.println("Nota1 menor ou igual nota2");
		} else {
			System.out.println("Nota1 maior que nota2");
		}

		// >= menor
		if (nota1 >= nota2) {
			System.out.println("Nota1 maior ou igual que nota2");
		} else {
			System.out.println("Nota1 menor que nota2");
		}
	}
}
