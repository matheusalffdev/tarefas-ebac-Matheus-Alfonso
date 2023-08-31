import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String arrayNomeESexo[];
        ArrayList<String> listMasculino = new ArrayList<>();
        ArrayList<String> listFeminino = new ArrayList<>();

        System.out.println("Digite o nome e sexo separados por `-` e ',' ");
        String nomesESexo = scanner.nextLine();

        arrayNomeESexo = nomesESexo.split(",");
        Arrays.sort(arrayNomeESexo);

        for(int x = 0; x < arrayNomeESexo.length; x++)
        {
            String nomeSexo[] = arrayNomeESexo[x].split("-");

            if(nomeSexo[1].toUpperCase().contains("M"))
            {
                listMasculino.add(nomeSexo[0].trim());
            }
            else
            {
                listFeminino.add(nomeSexo[0].trim());
            }
        }

        //Lista de masculino
        System.out.println("Lista masculina: ");
        for(int x=0; x < listMasculino.size(); x++)
        {
            System.out.println(listMasculino.get(x));
        }

        //Lista de feminino
        System.out.println("Lista Feminina: ");
        for(int x=0; x < listFeminino.size(); x++)
        {
            System.out.println(listFeminino.get(x));
        }
    }
}