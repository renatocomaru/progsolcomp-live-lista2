/* Nome do Aluno: Renato Comarú Matos
* RA: 1292314966
* Nome do Programa: exercicio7.java
* Data: 08/05/2023
*/
package exercícios;
import java.util.Scanner;

public class exercicio7 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      // Lê o número de diárias da hospedagem
      System.out.print("Digite o número de diárias: ");
      int numDiarias = scanner.nextInt();

      // Calcula o valor total da hospedagem
      double valorDiaria = 60.0;
      double taxaServico;

      if (numDiarias > 15) {
        taxaServico = 5.5;
      } else if (numDiarias == 15) {
        taxaServico = 6.0;
      } else {
        taxaServico = 8.0;
      }

      double valorTotal = numDiarias * (valorDiaria + taxaServico);

      // Imprime o valor total da hospedagem
      System.out.printf("O valor total da hospedagem é: R$ %.2f", valorTotal);
    }
  }
  
}
