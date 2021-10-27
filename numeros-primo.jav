//Recebe um valo do usuário, e mostrar todos os valores primos 

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner tcl = new Scanner(System.in);
	System.out.println("Digite até qual numero você quer calcular: ");
	int primoss = tcl.nextInt();
	for (int i = 2; i <= primoss; i++) {
    if( Primo(i) )
    System.out.println(i);
}    
}
    private static boolean Primo(int numero) {
    for (int j = 2; j < numero; j++) {
    if (numero % j == 0)
    return false;   
    }
    return true;
	}
}