package modulo8;

public class Aula02 {

	public static void main(String[] args) {

		int mediaAluno = 80;
		String nome = "Edvaldo";

		// Operador ternario;
		System.out.println((mediaAluno >= 70) ? "Aprovado" : "Reprovado");

		// Operador ternario com mais de uma condi��o;
		System.out.println((mediaAluno >= 70 && nome.equalsIgnoreCase("edvaldo")) ? "Aprovado"
				: (mediaAluno >= 40 && mediaAluno <= 69) ? "Recupera��o" : "Reprovado");

	}
}
