//5 - 1, 2 e 3
//Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou neutro.

import java.util.Scanner;
public class exercicio5 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor = entrada.nextInt();

        if (valor > 0){
            System.out.print("Valor positivo!");
        } else if(valor < 0){
            System.out.print("Valor negativo!");
        } else{
            System.out.print("Valor igual a zero!");
        }
        entrada.close();
    }
}