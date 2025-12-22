package JavaBasic; // Define o pacote onde a classe está

public class ArraysMultidimensionais {
    public static void main(String[] args) {

        // Declara um array bidimensional (matriz) 3x3
        // 3 linhas e 3 colunas
        int[][] dias = new int[3][3];

        // Preenchendo a primeira linha da matriz
        dias[0][0] = 31; // linha 0, coluna 0
        dias[0][1] = 29; // linha 0, coluna 1
        dias[0][2] = 30; // linha 0, coluna 2

        // Preenchendo a segunda linha da matriz
        dias[1][0] = 31; // linha 1, coluna 0
        dias[1][1] = 29; // linha 1, coluna 1
        dias[1][2] = 30; // linha 1, coluna 2

        // Preenchendo a terceira linha da matriz
        dias[2][0] = 31; // linha 2, coluna 0
        dias[2][1] = 29; // linha 2, coluna 1
        dias[2][2] = 30; // linha 2, coluna 2

        // Percorrendo a matriz usando for tradicional (com índices)
        for (int i = 0; i < dias.length; i++) { // percorre as linhas
            for (int j = 0; j < dias[i].length; j++) { // percorre as colunas
                System.out.println(dias[i][j]); // imprime cada valor
            }
        }

        // Separador visual no console
        System.out.println("[----------------------------]");

        // Percorrendo a matriz usando for-each (sem índices)
        for (int[] arrBase : dias) { // cada arrBase é uma linha da matriz
            for (int num : arrBase) { // percorre os valores da linha
                System.out.println(num); // imprime o valor
            }
        }
    }
}
