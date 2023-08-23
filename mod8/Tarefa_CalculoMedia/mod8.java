import java.util.Scanner;

public class mod8 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Informe a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Informe a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Informe a quarta nota: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("A media das notas eh: " + media);
    }
}
