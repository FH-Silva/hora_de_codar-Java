//20. CPF na nota?
//Faça um programa para ler:
//O nome do produto,
//A quantidade adquirida do produto,
//O preço unitário do produto.

//Agora o programa deve calcular e escrever:
//O valor da venda (valor da venda = quantidade adquirida * preço unitário),
//O percentual de desconto,
//O valor fixo de imposto que é 20%.
//O total a pagar (total a pagar = valor da venda - desconto).

//Sabendo-se que:
//Se quantidade <= 5 o desconto será de 2%
//Se quantidade > 5 e quantidade <=10 o desconto será de 3%
//Se quantidade > 10 o desconto será de 5%
//No fim, escreva um recibo que detalhe a compra como uma nota fiscal.

import java.util.Scanner;
public class exercicio20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nome = input.next();

        System.out.print("Qtd do produto: ");
        int qtd = input.nextInt();

        System.out.print("Preço: ");
        int preco = input.nextInt();

        int valorVenda = Math.round(preco * qtd + preco * 0.2f);
        float desconto = 0f;
        if (qtd <= 5){
            desconto = valorVenda - preco * 0.02f;
            System.out.println("Desconto de 2%");
        }else if (5 < qtd && qtd <= 10){
            desconto = valorVenda - preco * 0.03f;
            System.out.println("Desconto de 3%");
        }else if (qtd > 10){
            desconto = valorVenda - preco * 0.05f;
            System.out.println("Desconto de 5%");
        }else{
            System.out.println("Erro");
        }
        System.out.println("Produto: " + nome);
        System.out.println("Quantidade: " + qtd);
        System.out.println("Imposto: 20%");
        System.out.println("Total a pagar: R$" + desconto);
        input.close();
    }
}
