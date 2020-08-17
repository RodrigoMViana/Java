public class exercicio6 {
    public static void main(String[] args) {


      int anoInicial = 2002;
      int cont = 0;
      int anoAtual = 2020;
      double perc = 1.5;
      double salario = 600;

      while(cont <= 17) {

          salario = salario + perc/100;
          perc = perc*2;
          cont++;
      }
        System.out.println("O salário atual é: " + salario);
    }}