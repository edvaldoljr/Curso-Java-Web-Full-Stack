package modulo8;

public class Aula04 {

	  //Imprima os dias da semana 1 como domingo
    public static void main(String[] args) {

        System.out.println("Digite um dia da semana em números");
        int dia = 7;
        
        switch (dia) {
        case 1 -> System.out.println("Domingo");
        case 2 -> System.out.println("Segunda");
        case 3 -> System.out.println("Terça");
        case 4 -> System.out.println("Quarta");
        case 5 -> System.out.println("Quinta");
        case 6 -> System.out.println("Sexta");
        case 7 -> System.out.println("Sábado");
	
		default ->
		throw new IllegalArgumentException("N " + dia);
		}
    }
}