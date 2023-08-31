import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String arrayNomes[];

        System.out.println("Digite nomes separados por virgula: ");
        String nomes = scanner.nextLine();

        arrayNomes = nomes.split(",");
        Arrays.sort(arrayNomes);

        for(int x = 0; x < arrayNomes.length; x++)
        {
            System.out.println(arrayNomes[x]);
        }
    }
}