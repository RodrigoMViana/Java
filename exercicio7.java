import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva a quanto tempo você está na empresa, em anos: ");
        int tempo = scanner.nextInt();
        System.out.println("Escreva o seu salário: ");
        int salario = scanner.nextInt();
        double aumento = 0;
        if (tempo >=5) {
            aumento = salario * 0.2;
        }
        else {
            aumento = salario * 0.1;
        }
        System.out.println("Você terá um bonus de: " + aumento);
        }}