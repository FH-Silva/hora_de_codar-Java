//18. A pagar
//Desenvolva um programa para uma revendedora de carros usados que calcula o salário final de seus funcionários vendedores. O algoritmo deve receber como entrada o número de carros vendidos, o valor total das vendas, o salário fixo mensal do vendedor e a comissão fixa por carro vendido.
//O salário final do vendedor é calculado somando o salário fixo mensal, a comissão fixa por carro vendido e 5% do valor total das vendas realizadas pelo vendedor.
//Considere que o salário inicial é de R$ 5.000,00.
//O Programa deve exibir e detalhar cada venda, a comissão e o percentual e exibir o valor final.

import java.util.Scanner;
public class exercicio18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qtd de carros vendidos: ");
        int carrosVendidos = input.nextInt();

        System.out.print("Valor total das vendas: ");
        int totalVendas = input.nextInt();

        System.out.print("Salário fixo do vendedor: ");
        int salVendedor = input.nextInt();

        System.out.print("Comissão fixa por carro: ");
        int comPorCarro = input.nextInt();

        int valorVenda = Math.round(totalVendas * 0.05f);
        int comVendedor = comPorCarro * carrosVendidos;
        int salario = salVendedor + valorVenda + comVendedor;

        System.out.println("Quantidade de carros vendidos: " + carrosVendidos);
        System.out.println("Valor total dos carros  nesse mês: R$" + totalVendas);
        System.out.println("Salário do vendedor: R$" + salario + "\nSalário fixo R$" + salVendedor + " + 5% do total de vendas + Comissão por carro R$" + comVendedor);
        input.close();
    }
}
