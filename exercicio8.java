import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantas aulas ministradas: ");
        int total = scanner.nextInt();
        System.out.println("Digite quantas aulas esse aluno foi: ");
        int presenca = scanner.nextInt();
        System.out.println("digite a primeira nota: ");
        int nota1 = scanner.nextInt();
        System.out.println("digite a segunda nota: ");
        int nota2 = scanner.nextInt();
        int media = (nota1+nota2)/2;
        boolean aprovado = false;

        if (presenca == (total * 0.75)){
            aprovado = true;

        }

        else {
            aprovado = false;
        }

        if (media >= 6 && aprovado == true) {
            System.out.println("Aluno Aprovado :)");
        }
        else {
            System.out.println("Aluno reprovado :(");
        }
    }

    }
