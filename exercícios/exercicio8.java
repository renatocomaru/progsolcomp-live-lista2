/* Nome do Aluno: Renato Comarú Matos
* RA: 1292314966
* Nome do Programa: exercicio8.java
* Data: 08/05/2023
*/
package exercícios;
import java.util.Scanner;

public class exercicio8 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      // Lê o número do mês
      System.out.print("Digite o número do mês (entre 1 e 12): ");
      int mes = scanner.nextInt();

      // Verifica o nome do mês e a estação correspondente
      String nomeMes;
      String estacao;

      if (mes == 1) {
        nomeMes = "Janeiro";
        estacao = "Verão";
      } else if (mes == 2) {
        nomeMes = "Fevereiro";
        estacao = "Verão";
      } else if (mes == 3) {
        nomeMes = "Março";
        estacao = "Outono";
      } else if (mes == 4) {
        nomeMes = "Abril";
        estacao = "Outono";
      } else if (mes == 5) {
        nomeMes = "Maio";
        estacao = "Outono";
      } else if (mes == 6) {
        nomeMes = "Junho";
        estacao = "Inverno";
      } else if (mes == 7) {
        nomeMes = "Julho";
        estacao = "Inverno";
      } else if (mes == 8) {
        nomeMes = "Agosto";
        estacao = "Inverno";
      } else if (mes == 9) {
        nomeMes = "Setembro";
        estacao = "Primavera";
      } else if (mes == 10) {
        nomeMes = "Outubro";
        estacao = "Primavera";
      } else if (mes == 11) {
        nomeMes = "Novembro";
        estacao = "Primavera";
      } else if (mes == 12) {
        nomeMes = "Dezembro";
        estacao = "Verão";
      } else {
        System.out.println("Mês inválido!");
        return;
      }

      // Imprime o nome do mês e a estação correspondente
      System.out.println("Mês: " + nomeMes + " - Estação: " + estacao);
    }
  }
  
}
