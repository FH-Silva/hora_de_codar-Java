//17. Custa quanto?
//O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
//Supondo que o percentual do distribuidor seja de 28% e os impostos de 45% sobre o valor da fábrica, escreva um programa para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.

import java.util.Scanner;
public class exercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual o valor de fábrica do carro? ");
        float valorCarro = input.nextFloat();

        while (valorCarro <= 0){
            System.out.print("Valor inválido, digite novamente: ");
            valorCarro = input.nextFloat();
        }

        float distribuidor = valorCarro * 0.28f;
        float imposto = valorCarro * 0.45f;

        float result = valorCarro + distribuidor + imposto;
        System.out.print("Valor total: R$" + result);
        input.close();
    }
}
