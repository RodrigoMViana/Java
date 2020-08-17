import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Diga o valor do empréstimo desejado: ");
        int valorEmprestimo = scanner.nextInt();
        System.out.println("Diga o numero de parcelas que você deseja: ");
        int numParcelas = scanner.nextInt();
        System.out.println("Diga seu sálario: ");
        int salario = scanner.nextInt();

        double aprovacao = valorEmprestimo/numParcelas;

        double positivo = salario*0.3;

        if (aprovacao <= positivo ) {
            System.out.println("Empréstimo aprovado!!");
            }
        else {
            System.out.println("Empréstimo negado :(");
        }

    }}