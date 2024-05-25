//6.1 - Qual o maior? (4 vezes pior)
//Faça um programa para ler 4 valores (considere que não serão informados valores iguais) e escrever o maior deles.

import java.util.Scanner;

public class exercicio6e1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o primeiro valor: ");
        int v1 = entrada.nextInt();

        System.out.print("Insira o segundo valor: ");
        int v2 = entrada.nextInt();

        System.out.print("Insira o terceiro valor: ");
        int v3 = entrada.nextInt();

        System.out.print("Insira o quarto valor: ");
        int v4 = entrada.nextInt();

        int valor = Math.max(v3, Math.max(v1, v2));

        if (valor > v4){
            System.out.print("O maior valor é: " + valor);
        }else if (valor < v4){
            System.out.print("O maior valor é: " + v4);
        }else{
            System.out.print("Algo de errado não está certo :(");
        }
        entrada.close();
    }
}
