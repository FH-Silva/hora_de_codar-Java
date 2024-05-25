//6 - Qual o maior?
//Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o primeiro valor: ");
        int valor1 = entrada.nextInt();

        System.out.print("Insira o segundo valor: ");
        int valor2 = entrada.nextInt();

        System.out.print("Insira o terceiro valor: ");
        int valor3 = entrada.nextInt();

        if (valor1 > valor2 && valor1 > valor3){
            System.out.print("O maior valor é: " + valor1);
        }else if (valor2 > valor1 && valor2 > valor3){
            System.out.print("O maior valor é: " + valor2);
        }else if (valor3 > valor1 && valor3 > valor2){
            System.out.print("O maior valor é: " + valor3);
        }else{
            System.out.print("Os valores digitados são iguais :(");
        }
        entrada.close();
    }
}
