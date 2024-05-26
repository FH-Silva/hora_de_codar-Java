/*24. Jornada de trabalho
        A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais
        de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.

        Escreva um programa que leia o número de horas trabalhadas em um mês, o salário por hora e escreva
        o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
        (considere que o mês possua 4 semanas exatas)*/

import java.util.Scanner;
public class exercicio24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Considerando que trabalhe de Seg a Sex
        int diasNaSemana = 5;

        System.out.print("Horas trabalhadas no mês: ");
        int horasTrabalhadasPorSemana = input.nextInt() / 4; //Horas trabalhadas por mês convertido em horas trabalhadas por semana

        System.out.print("Salário por hora: ");
        int salario = input.nextInt();
        int salarioPorSemana = (salario * (horasTrabalhadasPorSemana / diasNaSemana) * diasNaSemana); //Salário que ele recebe na semana por X horas trabalhadas em Y dias

        if (horasTrabalhadasPorSemana >= 40){
            int salarioAcrescimo = Math.round(salarioPorSemana * 0.5f + salarioPorSemana) * 4;
            System.out.print("Salário no fimal do mês será: R$" + salarioAcrescimo);
        }else {
            int salarioPorMes = salarioPorSemana * 4;
            System.out.println("Salario no final do mês: R$" + salarioPorMes);
        }
        input.close();
    }
}
