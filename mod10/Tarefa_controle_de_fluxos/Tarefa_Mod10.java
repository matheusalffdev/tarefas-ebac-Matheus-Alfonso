import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Tarefa_Mod10
{
        public static void main(String[] args)
        {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Informe a primeira nota:");
                float nota1 = scanner.nextFloat();
                System.out.println("Informe a segunda nota: ");
                float nota2 = scanner.nextFloat();
                System.out.println("Informe a terceira nota: ");
                float nota3 = scanner.nextFloat();
                System.out.println("Informe a quarta nota: ");
                float nota4 = scanner.nextFloat();

                float media = calculaMedia(nota1, nota2, nota3, nota4);

                verificaAprovacao(media);


        }

        public static float calculaMedia(float n1, float n2, float n3, float n4)
        {
                float media = (n1+n2+n3+n4)/4;

                return media;
        }

        public static void verificaAprovacao(float media)
        {
                if(media >= 7)
                {
                        System.out.println("Aluno aprovado!");
                }
                else if (media >= 5)
                {
                        System.out.println("Aluno de recuperacao!");
                }
                else
                {
                        System.out.println("Aluno reprovado!");
                }
        }
}
