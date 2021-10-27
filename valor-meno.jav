/*Receber três valores e informar qual o menor. */
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner tcl= new Scanner(System.in);

        System.out.println("Digite o nome do primeiro valor: ");
        String nome1 = tcl.next();
        System.out.println("Digite a valor do primeiro valor: ");
        int valor1 = tcl.nextInt();

        System.out.println("Digite o nome do segundo valor: ");
        String nome2 = tcl.next();
        System.out.println("Digite a valor do segundo valor: ");
        int valor2 = tcl.nextInt();

        System.out.println("Digite o nome do terceiro valor: ");
        String nome3 = tcl.next();
        System.out.println("Digite a valor do terceiro valor: ");
        int valor3 = tcl.nextInt();

        if (valor1 < valor2 && valor1 < valor3) {
            System.out.println("O Valo mais baixo é:" + nome1);
            System.out.println("Com o valor: " + valor1);
        }

        else if (valor2 < valor1 && valor2 < valor3) {
            System.out.println("O Valo mais baixo é:" + nome2);
            System.out.println("Com o valor: " + valor2);

        }

        else if (valor3 < valor1 && valor3 < valor2) {
            System.out.println("O Valo mais baixo é:" + nome3);
            System.out.println("Com o valor: " + valor3);
        }

        if (valor1 > valor2 && valor1 > valor3) {
            System.out.println("O Valo mais alto é: " + nome1);
            System.out.println("Com o valor: " + valor1);
        }

        else if (valor2 > valor1 && valor2 > valor3) {
            System.out.println("O Valo mais alto é: " + nome2);
            System.out.println("Com o valor: " + valor2);

        }

        else if (valor3 > valor1 && valor3 > valor2) {
            System.out.println("O Valo mais alto é: " + nome3);
            System.out.println("Com o valor: " + valor3);
        }
	}
}