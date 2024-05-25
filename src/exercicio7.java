//7 - Qual o quê?
//Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.

import java.util.Scanner;
public class exercicio7 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        //Pegar os valores do usuário
        System.out.print("Escolha o primeiro valor: ");
        int valor1 = input.nextInt();

        System.out.print("Escolha o segundo valor: ");
        int valor2 = input.nextInt();

        System.out.print("Escolha o terceiro valor: ");
        int valor3 = input.nextInt();

        //Procurar o primeiro maior valor
        int maior = Math.max(valor3, Math.max(valor1, valor2));

        //Criar variavel que armazenará o segundo maior valor e em seguida procurar o segundo valor
        int segundMaior;
        if (maior == valor1){
            segundMaior = Math.max(valor2, valor3);
        }else if (maior == valor2){
            segundMaior = Math.max(valor1, valor3);
        }else {
            segundMaior = Math.max(valor1, valor2);
        }

        int result = maior + segundMaior;
        System.out.print("A soma dos dois maiores valores: " + result);
        input.close();
    }
}
