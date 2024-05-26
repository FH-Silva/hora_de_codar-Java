//16. O Voto é secreto
//Escreva um programa para ler:
//1.o número total de eleitores de um município.
//2.Agora o programa deve receber a quantindade (percentual):
//3.o número de votos brancos;
//4.o número de votos válidos;
//5.o número de votos nulos.
//6.Por fim, o programa vai calcular e escrever a quantidade de votos que cada categoria (brancos, nulos e válidos) representa em relação ao total de eleitores.

import java.util.Scanner;
public class exercicio16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //total de eleitores
        System.out.print("Quantos eleitores? ");
        int eleitores = input.nextInt();

        //total de votos (percentual)
        System.out.print("Votos brancos (percentual): ");
        float brancos = input.nextFloat();

        System.out.print("Votos válidos (percentual): ");
        float validos = input.nextInt();

        System.out.print("Votos nulos (percentual): ");
        float nulos = input.nextInt();

        //qtd de votos em cada categoria
        float vBranco = eleitores * (brancos/100);
        float vValidos = eleitores * (validos/100);
        float vNulos = eleitores * (nulos/100);

        System.out.println("Qtd de eleitores: " + eleitores);
        System.out.println("Qtd de votos brancos: " + Math.round(vBranco));
        System.out.println("Qtd de votos válidos: " + Math.round(vValidos));
        System.out.println("Qtd de votos nulos: " + Math.round(vNulos));
        input.close();
    }
}
