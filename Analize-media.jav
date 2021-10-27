/*Receber um valor de 0 a 10 e, se maior ou igual a 6, apresentar "aprovado"; se menor que 6 e maior que 4, apresentar "recuperação"; e, finalmente, se menor que 4, "reprovado".*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner tcl = new Scanner(System.in);
		System.out.println("Digite o valor da nota:");
		double nota1 = tcl.nextDouble();
		double media = (nota1);
		System.out.println ("NOTA: " +media);
		if(media>=6){ 
			System.out.println("APROVADO!");
		}
		else if((4<=media) && (media<6)){
			System.out.println("RECUPERAÇÃO!");
		}
		else{ 
			System.out.println ("REPROVADO");
		}
	}
}