import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double valor = 0;

        System.out.println("Digíte a quantidade de Litros: ");
        int nLitros = scanner.nextInt();

        System.out.println("Digite se é Alcool ou gasolina: Para alcool digite 1 e para gasolina 2");

        int combustivel = scanner.nextInt();


        if ( combustivel == 1 ) {
            if ( nLitros <= 20)  {
                valor = nLitros * 2.9 * 0.97 ;
                System.out.println("O valor a ser pago é: " + valor);
            }
            else {
                valor = nLitros * 2.9 * 0.95 ;
                System.out.println("O valor a ser pago é: " + valor);
            }
        }
        else {
            if (nLitros <= 20) {
                valor = nLitros * 3.3 * 0.96;
                System.out.println("O valor a ser pago é: " + valor);
            } else {
                valor = nLitros * 3.3 * 0.94;
                System.out.println("O valor a ser pago é: " + valor);
            }
        }
        }
    }

