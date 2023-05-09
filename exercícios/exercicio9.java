/* Nome do Aluno: Renato Comarú Matos
* RA: 1292314966
* Nome do Programa: exercicio9.java
* Data: 08/05/2023
*/
package exercícios;
import java.util.Scanner;

public class exercicio9 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      // Lê o valor da venda
      System.out.print("Digite o valor da venda: R$ ");
      double valorVenda = scanner.nextDouble();

      // Mostra o menu de opções
      System.out.println("Escolha a condição de pagamento:");
      System.out.println("1 - Venda à vista");
      System.out.println("2 - Venda a prazo 30 dias");
      System.out.println("3 - Venda a prazo 60 dias");
      System.out.println("4 - Venda a prazo 90 dias");
      System.out.println("5 - Venda com cartão de débito");
      System.out.println("6 - Venda com cartão de crédito");

      // Lê a opção escolhida
      System.out.print("Opção escolhida: ");
      int opcao = scanner.nextInt();

      // Calcula o desconto ou acréscimo correspondente à opção escolhida
      double desconto = 0;

      switch (opcao) {
        case 1:
          desconto = 0.1;
          break;
        case 2:
          desconto = 0.05;
          break;
        case 3:
          desconto = 0;
          break;
        case 4:
          desconto = -0.05;
          break;
        case 5:
          desconto = 0.08;
          break;
        case 6:
          desconto = 0.07;
          break;
        default:
          System.out.println("Opção inválida!");
          return;
      }

      // Calcula o valor final da venda com o desconto ou acréscimo
      double valorFinal = valorVenda * (1 - desconto);

      // Imprime o valor final da venda na tela
      System.out.printf("Valor final da venda: R$ %.2f\n", valorFinal);
    }
  }
  
}
