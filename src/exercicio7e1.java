//7.1 - 5 vezes?
//Faça um programa que leia 5  valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.

import java.util.Scanner;
public class exercicio7e1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        int v1 = entrada.nextInt();

        System.out.print("Segundo valor: ");
        int v2 = entrada.nextInt();

        System.out.print("Terceiro valor: ");
        int v3 = entrada.nextInt();

        System.out.print("Quarto valor: ");
        int v4 = entrada.nextInt();

        System.out.print("Quinto valor: ");
        int v5 = entrada.nextInt();

        int maior = Math.max(v5, Math.max(v4, Math.max(v3, Math.max(v1, v2))));

        int smaior;
        if (maior == v1){
            smaior = Math.max(v5, Math.max(v4, Math.max(v2, v3)));
        }else if (maior == v2){
            smaior = Math.max(v5, Math.max(v4, Math.max(v1, v3)));
        }else if (maior == v3){
            smaior = Math.max(v5, Math.max(v4, Math.max(v1, v2)));
        }else if (maior == v4){
            smaior = Math.max(v2, Math.max(v3, Math.max(v1, v5)));
        }else{
            smaior = Math.max(v4, Math.max(v3, Math.max(v1, v2)));
        }

        int result = maior + smaior;
        System.out.print("A soma dos dois maiores: " + result);
        entrada.close();
    }
}
