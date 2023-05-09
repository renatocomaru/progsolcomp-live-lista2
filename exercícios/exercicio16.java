/* Nome do Aluno: Renato Comarú Matos
* RA: 1292314966
* Nome do Programa: exercicio16.java
* Data: 08/05/2023
*/
package exercícios;
import java.util.Scanner;

public class exercicio16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero = 0;
    
    while (numero >= 0) {
      System.out.print("Digite um número (digite um número negativo para sair): ");
      numero = sc.nextInt();
    }
    
    System.out.println("Programa encerrado.");
    sc.close();
  }  
}
