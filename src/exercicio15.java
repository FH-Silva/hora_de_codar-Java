//15 - Uma Brincadeira Sobre Alturas
//Anacleto tem 1,50 metro e cresce 2 centímetros por ano, enquanto Felisberto tem 1,1O metro e cresce 3 centímetros por ano.
//Construa um programa que calcule e imprima quantos anos serão necessários para que Felisberto seja maior que Anacleto.

public class exercicio15 {
    public static void main(String[] args) {

        //Conversão de m para cm: 1,5m * 100 = 150cm
        int anacleto = 150;
        int felisberto = 110;

        int valor = anacleto - felisberto;
        System.out.println(valor + " anos para Felisberto ficar maior que Anacleto");
    }
}