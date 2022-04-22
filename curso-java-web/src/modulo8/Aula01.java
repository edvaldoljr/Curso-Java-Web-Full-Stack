package modulo8;

public class Aula01 {

	public static void main(String[] args) {

		int mediaAluno = 80;
		String nome = "Edvaldo";

		// If Else;
		if (mediaAluno >= 70 && nome.equalsIgnoreCase("EDVALDO")) {
			System.out.println("Aprovado");
		} else if (mediaAluno < 70) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Aluno não encontrado");
		}
		
		//Operador ternario;
		System.out.println((mediaAluno >= 70) ? "Aprovado" : "Reprovado");
		
		
		//Operador ternario com mais de uma condição;
		System.out.println((mediaAluno >= 70 && nome.equalsIgnoreCase("edvaldo")) ? "Aprovado" : (mediaAluno >= 40  && mediaAluno <= 69) ? "Recuperação" : "Reprovado");
		
	}
}