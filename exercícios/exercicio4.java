/* Nome do Aluno: Renato Comarú Matos
* RA: 1292314966
* Nome do Programa: exercicio4.java
* Data: 08/05/2023
*/
package exercícios;
import java.util.Scanner;

public class exercicio4 {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      
      // Lê o número inteiro
      System.out.print("Digite um número inteiro: ");
      int numero = scanner.nextInt();

      // Verifica se o número é par ou ímpar e positivo ou negativo
      if (numero % 2 == 0) {
        System.out.print("O número " + numero + " é par e ");
      } else {
        System.out.print("O número " + numero + " é ímpar e ");
      }
      if (numero >= 0) {
        System.out.println("positivo");
      } else {
        System.out.println("negativo");
      }
    }
  }
  
}
