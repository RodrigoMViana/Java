import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Diga a hora que você entrou: ");
        int horaEntrada = scanner.nextInt();
        System.out.println("Diga o minuto que você entrou: ");
        int minutoEntrada = scanner.nextInt();
        System.out.println("Diga a hora que você saiu: ");
        int horaSaida = scanner.nextInt();
        System.out.println("Diga o minuto que você saiu: ");
        int minutoSaida = scanner.nextInt();

        int soma = 1;
        int tempo = horaSaida - horaEntrada;
        int valor = 6;
        if (tempo < 1) {
            System.out.println("O valor a ser pago é: R$ 4,00");
            }
            else if (tempo > 1 && tempo <= 2) {
            System.out.println("O valor a ser pago é: R$ 6,00");
        }
            else if (tempo >= 3) {
                valor = valor + 1;
        }

    }}