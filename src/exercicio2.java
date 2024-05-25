//2 -  Hello Clarice
//Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".

import java.util.Scanner;
public class exercicio2 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        String nomeUser = entrada.nextLine();
        System.out.print("Olá, " + nomeUser);
        entrada.close();
    }
}
