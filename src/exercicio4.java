//4 - A Bit of Geometry
//Considerando a figura abaixo, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas respectivas áreas. O usuário irá informar os valores de cada variável. Crie um arquivo para cada fórmula e poste os  arquivos no GitHub. Link do repositório abaixo.

import java.util.Scanner;
public class exercicio4 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        //Área do retângulo
        System.out.print("Digite um valor para a base do retângulo (cm): ");
        int base = input.nextInt();

        System.out.print("Digite o valor para a altura (cm): ");
        int altura = input.nextInt();

        System.out.println("Área = " + base * altura);

        //Área do quadrado
        System.out.print("Digite um valor para os lados do quadrado (cm): ");
        double lado = input.nextDouble();

        System.out.println("Área = " + Math.pow(lado, 2));

        //Área do losango
        System.out.print("Digite um valor para a diagonal maior do losango (cm): ");
        int maior = input.nextInt();

        System.out.print("Digite o valor para a diagonal menor (cm): ");
        int menor = input.nextInt();

        System.out.println("Área = " + maior * menor / 2);

        //Área do trapézio
        System.out.print("Digite o valor para a base maior do trapézio (cm): ");
        int baseMaior = input.nextInt();

        System.out.print("Digite o valor para a base menor (cm): ");
        int baseMenor = input.nextInt();

        System.out.print("Digite o valor para a altura (cm): ");
        int alturaTrapezio = input.nextInt();

        System.out.println("Área = " + (baseMaior + baseMenor) * alturaTrapezio / 2);

        //Área do Paralelogramo
        System.out.print("Digite o valor para a altura do Paralelogramo (cm): ");
        int h = input.nextInt();

        System.out.print("Digite o valor para a base (cm): ");
        int b = input.nextInt();

        System.out.println("Área = " + h * b);

        //Área do Triângulo
        System.out.print("Digite o valor para a altura do triângulo (cm): ");
        int hTriangulo = input.nextInt();

        System.out.print("Digite o valor para a base (cm): ");
        int bTriangulo = input.nextInt();

        System.out.println("Área = " + hTriangulo * bTriangulo / 2);

        //Área do Círculo
        System.out.print("Digite o valor para o raio círculo (cm): ");
        double raio = input.nextDouble();

        System.out.println("Área = " + Math.pow(raio,2) * Math.PI);
        input.close();
    }
}