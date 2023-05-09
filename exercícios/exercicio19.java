/* Nome do Aluno: Renato Comarú Matos
* RA: 1292314966
* Nome do Programa: exercicio19.java
* Data: 08/05/2023
*/
package exercícios;
import java.util.Scanner;

public class exercicio19 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Digite o volume inicial do gás em centímetros cúbicos: ");
      double volumeInicial = scanner.nextDouble();

      int tempo = 0;

      while (volumeInicial <= 1000) {
          volumeInicial *= 2;
          tempo++;
      }

      System.out.println("O tempo necessário para que o volume do gás se torne maior que 1000 centímetros cúbicos é: " + tempo + " segundos.");
    }
}
}
