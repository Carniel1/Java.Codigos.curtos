//Recebe um valo do usuário, e mostrar todos os valores  pares.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	System.out.println("Digite até qual numero você quer calcular: ");
	Scanner tcl = new Scanner(System.in);
   int pares = tcl.nextInt();
    for (int valor =0; valor<= pares; valor=valor+2){
	    System.out.println(valor);

}
}
}