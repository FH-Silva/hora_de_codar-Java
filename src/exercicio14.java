//14 - Passou no Teste?
//Escreva um programa para ler 6 notas de um aluno, calcular e imprimir a média final. Considere que a nota de aprovação é 6,5. Logo após escrever a mensagem "Calcular a média de outro aluno Sim/Não?" e solicitar um resposta. Se a resposta for "S", o programa deve ser executado novamente, caso contrário deve ser encerrado exibindo a quantidade de alunos aprovados.

import java.util.Scanner;
public class exercicio14{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        String user;//Variavel para armazenar o "sim" ou "não" do usuário
        int aprovados = 0;
        int reprovados = 0;

        do {
            float soma = 0f;
            int i = 1;

            while (i <= 6) {
                System.out.print("Nota " + i + ", do aluno: ");
                soma += input.nextInt(); //Pega o valor e soma, 6 vezes
                i++;
            }
            float result = soma / 6; //Tira a média simples

            //Verifica se está aprovado ou reprovado
            if (result >= 6.5){
                System.out.println("Nota final: " + result + ". Aprovado!");
                aprovados++;
            }else{
                System.out.println("Nota final: " + result + ". Reprovado!");
                reprovados++;
            }

            //Pergunta se quer repetir o processo
            System.out.print("Quer calcular a nota do próximo? ");
            user = input.next();

        }while(user.equalsIgnoreCase("sim"));

        System.out.println("Alunos aprovados: " + aprovados);
        System.out.println("Alunos reprovados: " + reprovados);
        input.close();
    }
}