//11 - BOOOOMMM
//Crie uma bomba relógio (usando somente código - para deixar claro!) cuja contagem regressiva vá de 30 a 0. Escreva a contagem em tela e no final da repetição escreva "EXPLOSÃO".

public class exercicio11 {
    public static void main(String[] args) {
        int i = 30;
        while (i >= 0){
            System.out.println(i);
            i--;
        }
        System.out.println("EXPLOSÃOOOOOOOOO!!!!!!!!");
    }
}
