/* Nome do Aluno: Renato Comarú Matos
* RA: 1292314966
* Nome do Programa: exercicio18.java
* Data: 08/05/2023
*/
package exercícios;
import java.util.Scanner;

public class exercicio18 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Digite um número para calcular o fatorial: ");
      int number = scanner.nextInt();

      long fatorial = 1;

      for (int i = 1; i <= number; i++) {
          fatorial *= i;
      }

      System.out.println("O fatorial de " + number + " é: " + fatorial);
    }
}
}
