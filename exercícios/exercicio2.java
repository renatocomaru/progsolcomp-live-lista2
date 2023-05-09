/* Nome do Aluno: Renato Comarú Matos
* RA: 1292314966
* Nome do Programa: exercicio2.java
* Data: 08/05/2023
*/

package exercícios;
import java.util.Scanner;

public class exercicio2 {
  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {
      // Lê os números A, B e C
      System.out.print("Digite o valor de A: ");
      int a = scanner.nextInt();

      System.out.print("Digite o valor de B: ");
      int b = scanner.nextInt();

      System.out.print("Digite o valor de C: ");
      int c = scanner.nextInt();

      // Ordena os números em ordem crescente
      int temp;
      if (a > b) {
        temp = a;
        a = b;
        b = temp;
      }
      if (b > c) {
        temp = b;
        b = c;
        c = temp;
      }
      if (a > b) {
        temp = a;
        a = b;
        b = temp;
      }

      // Imprime os números em ordem crescente
      System.out.println("Os números em ordem crescente são: " + a + ", " + b + ", " + c);
    }
  }
  
}
