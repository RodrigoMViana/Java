import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe sua idade");
        int idade = scanner.nextInt();
        System.out.println("informe sua altura");
        int altura = scanner.nextInt();

        int cont = 0;

        while (cont<=45) {
            System.out.println("Informe sua idade");
            int idade = scanner.nextInt();
            System.out.println("informe sua altura");
            int altura = scanner.nextInt();
            int media = 0;
            int soma = 0;
            if (altura < 1.7) {
                soma = soma + idade;
                        media = soma/cont;
                System.out.println("A idade média das pessoas com menos de 1.7 é: " + media);
            }
                else if (idade > 20) {
                    soma = soma + altura;
                        media = soma/cont;
                System.out.println("A altura média das pessoas com mais de 20 anos é: " + media);
            }

            cont++
        }

    }
}