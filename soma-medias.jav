/*Receber três valores e informar a sua média. */
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner tcl = new Scanner(System.in);
		System.out.println("valor 1:");
		double valor1 = tcl.nextDouble();
		System.out.println("valor 2:");
		double valor2 = tcl.nextDouble();
		System.out.println("valor 3:");
		double valor3 = tcl.nextDouble();
		double media = (valor1+valor2+valor3)/3;
		System.out.println ("A media dos valores é: " +media);
	}
}