/* Nome do Aluno: Renato Comarú Matos
* RA: 1292314966
* Nome do Programa: exercicio1.java
* Data: 08/05/2023
*/

package exercícios;
import java.util.Scanner;

public class exercicio1 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      
      // Lê os números A e B
      System.out.print("Digite o valor de A: ");
      int a = scanner.nextInt();

      System.out.print("Digite o valor de B: ");
      int b = scanner.nextInt();

      // Verifica qual é o maior número
      int maior = a;
      if (b > a) {
        maior = b;
      }

      // Imprime o resultado
      System.out.println("O maior número é " + maior);
    }
  }
}
