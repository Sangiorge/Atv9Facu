import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Requisito 1: Pedir valor da temperatura em graus Fahrenheit
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual valor da temperatura em Fahrenheit? ");
        double temperatura = sc.nextDouble();
        sc.close();

        // Requisito 2: Converter Fahrenhit para Celsius
        double celsius = (temperatura - 32) / 1.8;

        // Requisito 3: Imprima a conversão das medidas de temperatura
        System.out.print("O valor da temperatura convertida de Fahrenheit para Celsius será: " + celsius);

    }
}
