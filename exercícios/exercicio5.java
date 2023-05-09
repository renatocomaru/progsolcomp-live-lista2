/* Nome do Aluno: Renato Comarú Matos
* RA: 1292314966
* Nome do Programa: exercicio5.java
* Data: 08/05/2023
*/
package exercícios;
import java.util.Scanner;

public class exercicio5 {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      // Lê os dados da pessoa
      System.out.print("Digite o nome: ");
      String nome = scanner.nextLine();

      System.out.print("Digite o sobrenome: ");
      String sobrenome = scanner.nextLine();

      System.out.print("Digite a idade: ");
      int idade = scanner.nextInt();
      scanner.nextLine(); // Limpa o buffer do teclado

      System.out.print("Digite a naturalidade: ");
      String naturalidade = scanner.nextLine();

      // Pergunta se deseja visualizar dados completos
      System.out.print("Deseja visualizar dados completos? (S/N) ");
      char opcao = scanner.nextLine().charAt(0);

      // Verifica a opção escolhida e imprime os dados correspondentes
      if (opcao == 'S' || opcao == 's') {
        System.out.println("Nome completo: " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Naturalidade: " + naturalidade);
      } else if (opcao == 'N' || opcao == 'n') {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
      } else {
        System.out.println("Digitação errada. Tente Novamente");
      }
    }
  }
  
}
