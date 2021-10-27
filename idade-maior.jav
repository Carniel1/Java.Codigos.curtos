/*Receber dois valores e informar qual é o maior */
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		 Scanner tcl = new Scanner(System.in);

        System.out.println("Digite o nome do primeiro valor: ");
        String nome1 = tcl.next();
        System.out.println("Digite o primeiro valor: ");
        int valor2 = tcl.nextInt();

        System.out.println("Digite o nome do segundo valor: ");
        String nome2 = tcl.next();
        System.out.println("Digite o segundo valor: ");
        int valor1 = tcl.nextInt();

        if (valor2 < valor1) {
            System.out.println("O valor mais baixo é:" + nome1);
            System.out.println("Com o valor de: " + valor2);
        }

        else if (valor1 < valor2) {
            System.out.println("O valor mais baixo é:" + nome2);
            System.out.println("Com o valor de: " + valor2);

        }

        if (valor2 > valor1) {
            System.out.println("O valor mais alto é: " + nome1);
            System.out.println("O valor mais alto é:" + valor2);
        }

        else if (valor1 > valor2) {
            System.out.println("O valor mais alto é:" + nome2);
            System.out.println("Com o valor de:" + valor1);

        }
    }

}