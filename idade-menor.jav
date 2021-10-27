/*Receber o nome e a idade de duas pessoas e informar qual é o mais novo. */
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		 Scanner tcl = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa: ");
        String nome1 = tcl.next();
        System.out.println("Digite a idade da primeira pessoa: ");
        int idade1 = tcl.nextInt();

        System.out.println("Digite o nome da segunda pessoa: ");
        String nome2 = tcl.next();
        System.out.println("Digite a idade da segunda pessoa: ");
        int idade2 = tcl.nextInt();

        if (idade1 < idade2) {
            System.out.println("A pessoa mais nova é:" + nome1);
            System.out.println("Com idade de: " + idade1);
        }

        else if (idade2 < idade1) {
            System.out.println("A pessoa mais nova é:" + nome2);
            System.out.println("Com idade de: " + idade2);

        }

        if (idade1 > idade2) {
            System.out.println("A pessoa mais velha é: " + nome1);
            System.out.println("Com idade de: " + idade1);
        }

        else if (idade2 > idade1) {
            System.out.println("A pessoa mais velha é: " + nome2);
            System.out.println("Com idade de: " + idade2);

        }
    }

}