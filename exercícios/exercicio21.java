/* Nome do Aluno: Renato Comarú Matos
* RA: 1292314966
* Nome do Programa: exercicio20.java
* Data: 08/05/2023
*/
package exercícios;
import java.util.Scanner;

public class exercicio21 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Digite um número positivo: ");
      int numero = scanner.nextInt();

      if (numero <= 0) {
          System.out.println("O número digitado não é positivo.");
      } else {
          for (int i = 1; i <= numero; i++) {
              System.out.println("\nTabuada do " + i + ":");
              for (int j = 1; j <= 10; j++) {
                  System.out.println(i + " x " + j + " = " + (i * j));
              }
          }
        }
    }
  }
}
