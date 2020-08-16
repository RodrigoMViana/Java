import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Diga o preço da etiqueta");
        int pe = scanner.nextInt();
        System.out.println("Diga a forma de pagamento: A vista em dinheiro = 1 , a vista cartão = 2, cartao de credito 2 vezes = 3, cartao de credito 3 vezes = 4");
        int cp = scanner.nextInt();
        double valor = 0;

            if (cp == 1) {
                valor = pe * 0.9;
                System.out.println("Valor a ser pago é: " + valor);
            }
                if (cp == 2) {
                    valor = pe * 0.95;
                    System.out.println("Valor a ser pago é: " + valor);
                }
                    if (cp == 3) {
                        valor = pe;
                        System.out.println("Valor a ser pago é: " + valor);
                    }
                        if (cp == 4) {
                            valor = pe * 1.1;
                            System.out.println("Valor a ser pago é: " + valor);
                        }





                }
            }


