/* Nome do Aluno: Renato Comarú Matos
* RA: 1292314966
* Nome do Programa: exercicio14.java
* Data: 08/05/2023
*/
package exercícios;
import java.util.Arrays;

public class exercicio14 {
  public static void main(String[] args) {
    int[] vetor = new int[50];
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = 0;
    }
    System.out.println("Vetor preenchido com zeros: " + Arrays.toString(vetor));
  }
}
