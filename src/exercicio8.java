//8 - Enquanto isso
//Faça um programa para ler 2 valores informados pelo usuário e se o segundo valor informado for neutro, deve ser lido um novo valor - ou seja, para o segundo valor não pode ser aceito o valor zero nem um valor negativo. O programa deve imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido.

import java.util.Scanner;
public class exercicio8 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escolha o primeiro valor: ");
        int valor1 = entrada.nextInt();

        int valor2;
        do {
            System.out.print("Escolha o segundo valor: ");
            valor2 = entrada.nextInt();
        }while(valor2 <= 0);

        int result = valor1 / valor2;
        System.out.println("Resultado = " + result);
        entrada.close();
    }
}
