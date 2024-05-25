//13 - De quanto até quanto?
//Faça um algoritmo que calcule e escreva a média aritmética dos dois números inteiros informados pelo usuário e todos os números inteiros entre eles. Considere que o primeiro sempre será menor que o segundo.

import java.util.Scanner;
public class exercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Pega os valores do usuário
        System.out.print("Primeiro valor: ");
        int valor1 = input.nextInt();

        System.out.print("Segundo valor: ");
        int valor2 = input.nextInt();

        //Variaveis para guardar a soma e a quantidade de elementos entre dois números
        int soma = 0;
        int qtdElementos = 0;

        //Pega os valores entre "valor1" e "valor2" e faz a soma
        do {
            soma += valor1++;
            qtdElementos++;
        } while (valor1 <= valor2);

        //Faz a divisão e exibe o resultado
        int result = soma / qtdElementos;
        System.out.print("Resultado = " + result);
        input.close();
    }
}
