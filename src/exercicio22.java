/*22. Conta comigo
        Escreva um algoritmo que imprima as seguintes seqüências de números:

        (1, 1 2 3 4 5 6 7 8 9 10)
        (2, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
        (3, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30)

        E assim sucessivamente, até
        que o primeiro número (antes da vírgula), também chegue a 20.*/

public class exercicio22 {
    public static void main(String[] args) {
        int total = 20;
        int num = 10;

        int i = 1;
        while (i <= total) {
            System.out.print("(" + i + ", ");

            int inicio = (i - 1) * num + 1;
            int fim = inicio + num - 1;
            i++;

            int j = inicio;
            while (j <= fim) {
                System.out.print(j);
                if (j < fim) {
                    System.out.print(", ");
                }
                j++;
            }
            System.out.println(")");
        }
    }
}
