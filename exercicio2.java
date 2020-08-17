import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
            int nota1 = scanner.nextInt();
        System.out.println("Digite a primeira nota: ");
            int nota2 = scanner.nextInt();
        System.out.println("Digite a primeira nota: ");
            int nota3 = scanner.nextInt();

    int media = (nota1 + nota2 + nota3)/3;
        System.out.println("A média das notas é: " + media);
    }
}