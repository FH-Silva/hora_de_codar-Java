//10 - Parabéns
//Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever a média do semestre e a seguinte mensagem: PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas).

import java.util.Scanner;
public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float soma = 0f;
        int i = 1;
        while(i <= 4){
            System.out.print("Nota da avaliação " + i + ": ");
            soma += scanner.nextFloat();
            i++;
        }

        float result = soma / 4;
        if (result >= 6){
            System.out.println("Parabéns, sua nota foi: " + result);
        }else {
            System.out.print("Reprovado, sua nota foi: " + result);
        }
        scanner.close();
    }
}
