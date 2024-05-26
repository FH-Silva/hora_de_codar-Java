
import java.util.Scanner;
public class testes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Valor: ");
        String valor = input.nextLine().toLowerCase();
        System.out.println(valor);
        input.close();
    }
}
