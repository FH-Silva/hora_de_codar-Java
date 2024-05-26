/*23. Não Conta comigo
        Escreva um algoritmo que imprima as seguintes seqüências de números:

        (1, 1 2 3 4 5 6 7 8 9 10)
        (2, 1 2 3 4 5 6 7 8 9 10)
        (3, 1 2 3 4 5 6 7 8 9 10)

        E assim sucessivamente, até
        que o primeiro número (antes da vírgula), também chegue a 20.*/

public class exercicio23 {
    public static void main(String[] args) {
        double v = 1.12345678910;
        while (v <= 20) {
            System.out.println(v);
            v++;
        }
        System.out.println(v);
    }
}
