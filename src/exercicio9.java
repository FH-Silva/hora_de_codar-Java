//9 -  Cansar de Digitar
//Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba os números informados e escreva a média aritmética desses valores lidos.

import java.sql.SQLOutput;
import java.util.Scanner;
public class exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float soma = 0;
        int i = 1;
        while(i <= 10){
            System.out.print("Digite o valor " + i + ": ");
            soma += entrada.nextFloat();
            i++;
        }

        float result = soma / 10;
        System.out.print("Resultado = " + result);
        entrada.close();
    }
}
