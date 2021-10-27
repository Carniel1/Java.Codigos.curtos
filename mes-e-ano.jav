/*Receber um valor inteiro e informar a qual mês o ano que este se refere.*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner tcl = new Scanner(System.in);
        System.out.println("Digite o numero do Produto");
        int Produto = tcl.nextInt();
        System.out.println("Digite o Valor");
        int valor = tcl.nextInt();
        

    switch(Produto) {
        case 1:
        System.out.println("Produto: R$: " +valor);
        break;
        case 2:
        System.out.println("Produto: R$: " +valor);
        break;
        case 3:
        System.out.println("Produto: R$: " +valor);
        break;
        case 4:
        System.out.println("Produto: R$: " +valor);
        break;
        case 5:
        System.out.println("Produto: R$: " +valor);
        break;
        case 6:
        System.out.println("Produto R$ : " +valor);
        break;
        case 7:
        System.out.println("Produto R$ : " +valor);
        break;
        case 8:
        System.out.println("Produto R$ : " +valor);
        break;
        case 9:
        System.out.println("Produto R$ : " +valor);
        break;
        case 10:
        System.out.println("Produto: R$ : " +valor);
        break;
        case 11:
        System.out.println("Produto: R$ : " +valor);
        break;
        case 12:
        System.out.println("Produto: R$ : " +valor);
        case 13:
        System.out.println("Produto R$: " +valor);
        break;
        case 14:
        System.out.println("Produto R$: " +valor);
        break;
        default:
        System.out.println("ERRO: Produto invalido Digite um codigo valido");
    }
	}
}