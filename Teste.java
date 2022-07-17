import java.io.IOException;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double valor = Double.parseDouble(leitor.nextLine());
        if (valor >= 0 && valor <= 25.000000) {
            System.out.println("Entre [0,25]");
        } else if (valor > 25.000001 && valor <= 50.000000) {
            System.out.println("Entre (25,50]");
        } else if (valor > 50.000001 && valor <= 75.000000) {
            System.out.println("Entre (50,75]");  
        } else if (valor > 75.000001 && valor <= 100.000000) {
            System.out.println("Entre (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
    } 
}
