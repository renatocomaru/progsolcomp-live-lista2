/* Nome do Aluno: Renato Comarú Matos
* RA: 1292314966
* Nome do Programa: exercicio20.java
* Data: 08/05/2023
*/
package exercícios;
import java.util.Scanner;

public class exercicio20 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Digite a carga máxima do elevador em quilogramas: ");
      double cargaMaxima = scanner.nextDouble();

      System.out.print("Digite a quantidade máxima de pessoas no elevador: ");
      int quantidadeMaximaPessoas = scanner.nextInt();

      double cargaAtual = 0;
      int pessoasNoElevador = 0;

      do {
          System.out.print("Digite o peso da pessoa " + (pessoasNoElevador + 1) + " em quilogramas: ");
          double pesoPessoa = scanner.nextDouble();

          if (cargaAtual + pesoPessoa <= cargaMaxima && pessoasNoElevador < quantidadeMaximaPessoas) {
              cargaAtual += pesoPessoa;
              pessoasNoElevador++;
          } else {
              break;
          }
      } while (cargaAtual < cargaMaxima && pessoasNoElevador < quantidadeMaximaPessoas);

      System.out.println("O elevador atingiu a carga máxima ou a quantidade máxima de pessoas.");
      System.out.println("Carga atual do elevador: " + cargaAtual + " kg");
      System.out.println("Pessoas no elevador: " + pessoasNoElevador);
    }
}
}
