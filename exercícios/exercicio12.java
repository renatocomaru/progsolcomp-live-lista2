/* Nome do Aluno: Renato Comarú Matos
* RA: 1292314966
* Nome do Programa: exercicio12.java
* Data: 08/05/2023
*/
package exercícios;

public class exercicio12 {

  public static void main(String[] args) {
    int i = 0;
    do {
      if (i % 2 == 0) {
        System.out.println(i);
      }
      i++;
    } while (i % 7 != 0);
  }
}
