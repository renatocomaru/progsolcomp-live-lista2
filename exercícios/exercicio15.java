/* Nome do Aluno: Renato Comarú Matos
* RA: 1292314966
* Nome do Programa: exercicio15.java
* Data: 08/05/2023
*/
package exercícios;

public class exercicio15 {
   public static void main(String[] args) {
    int[][] matriz = new int[10][10];
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[0].length; j++) {
        matriz[i][j] = 0;
       }
    }
    System.out.println("Matriz preenchida com zeros: ");
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[0].length; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }
  }
}

