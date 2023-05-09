/* Nome do Aluno: Renato Comarú Matos
* RA: 1292314966
* Nome do Programa: exercicio3.java
* Data: 08/05/2023
*/
package exercícios;
import java.util.Scanner;

public class exercicio3 {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      // Lê os números A e B
      System.out.print("Digite o valor de A: ");
      int a = scanner.nextInt();

      System.out.print("Digite o valor de B: ");
      int b = scanner.nextInt();

      // Verifica se os números são múltiplos
      if (a % b == 0 || b % a == 0) {
        System.out.println("São múltiplos");
      } else {
        System.out.println("Não são múltiplos");
      }
    }
  }
  
}
