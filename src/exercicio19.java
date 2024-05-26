//19. É o quê?
//Crie um programa para ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam ou não um triângulo.
//Obs: para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.

import java.util.Scanner;
public class exercicio19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Valor para A: ");
        int a = input.nextInt();

        System.out.print("Valor para B: ");
        int b = input.nextInt();

        System.out.print("Valor para C: ");
        int c = input.nextInt();

        if (a < b + c && b < a + c && c < a + b){
            System.out.print("Pode forma um triângulo");
        }else{
            System.out.print("Não pode forma um triângulo");
        }
        input.close();
    }
}
