import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        System.out.println("Informe a temperatura em Graus Celsisus(C°): ");
        float C;
        Scanner leia = new Scanner(System.in);
        C = leia.nextFloat();
        leia.close();

        double F;

        F = (C * 1.8) + 32;

        System.out.printf("A temperatura em Fahrenheit é [%.2f°]", F);
    }

}
