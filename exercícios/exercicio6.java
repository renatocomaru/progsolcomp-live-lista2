/* Nome do Aluno: Renato Comarú Matos
* RA: 1292314966
* Nome do Programa: exercicio6.java
* Data: 08/05/2023
*/
package exercícios;
import java.util.Scanner;

public class exercicio6 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      // Lê a nota do aluno
      System.out.print("Digite a nota do aluno (de 0 a 100): ");
      int nota = scanner.nextInt();

      // Verifica o conceito do aluno de acordo com a nota
      String conceito;
      if (nota >= 0 && nota <= 49) {
        conceito = "Insuficiente";
      } else if (nota >= 50 && nota <= 64) {
        conceito = "Regular";
      } else if (nota >= 65 && nota <= 84) {
        conceito = "Bom";
      } else if (nota >= 85 && nota <= 100) {
        conceito = "Ótimo";
      } else {
        System.out.println("Nota inválida!");
        return;
      }

      // Imprime o conceito do aluno
      System.out.println("Conceito: " + conceito);
    }
  }
}
