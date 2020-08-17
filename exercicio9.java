import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Diga a idade do nadador: ");
        int idade = scanner.nextInt();

        if (idade>=5 && idade<=10) {
            System.out.println("Esse nadador é da categoria Infantil!");
        }
                 else if  (idade>=11 && idade<=17) {
                System.out.println("Esse nadador é da categoria Juvenil!");
            }
                    else if(idade >=18) {
                        System.out.println("Esse nadador é da categoria Sênior!");

                    }
                    else {
                        System.out.println("Esse nadador ainda não pode nadar");

                    }

                }

        }


