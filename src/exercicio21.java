/*21. Descanso merecido
        Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para
        estar em condições, um dos seguintes requisitos deve ser satisfeito:

        - Ter no mínimo 65 anos de idade.
        - Ter trabalhado no mínimo 30 anos.
        - Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.

        Com base nas informações acima, faça um algoritmo que leia: o número do empregado (código), o ano
        de seu nascimento e o ano de seu ingresso na empresa. O programa deverá escrever a idade e o tempo
        de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou 'Não requerer'.*/

import java.util.Scanner;
public class exercicio21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Número do funcionário: ");
        int id = input.nextInt();

        System.out.print("Ano de nascimento: ");
        int nascimento = input.nextInt();

        System.out.print("Ano de ingresso: ");
        int ingresso = input.nextInt();

        if (nascimento <= 1959 && ingresso <= 1994){
            int idade = 2024 - nascimento;
            int tTrabalho = 2024 - ingresso;
            System.out.println("id: " + id + "\nIdade: " + idade + "\nTempo trabalhado: " + tTrabalho);

            System.out.print("Requerer aposentadoria? ");
            String escolha = input.next().toLowerCase();
            if (escolha.equals("sim")){
                System.out.println("Aposentadoria aprovada");
            }else{
                System.out.println("Aposentadoria não requerida");
            }
        }else{
            System.out.println("Não tem direito a aposentadoria no momento");
        }
        input.close();
    }
}
