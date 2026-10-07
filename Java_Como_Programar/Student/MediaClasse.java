package Student;

import java.util.Scanner;

public class MediaClasse {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int total = 0;
        int contador = 1;

        System.out.printf("Insira a Nota do %sº Aluno ou -1 para Finalizar %n", contador);
        int media = input.nextInt();

        while (media >= 0){
            total = total + media;
            contador = contador + 1;

            System.out.printf("Insira a Nota do %sº Aluno ou -1 para Finalizar %n", contador);
            media = input.nextInt();
        }

        if (contador != 0){
            media = total / contador;
            System.out.printf("A Média da turma é %s", media);
        } else {
            System.out.println("Nenhuma nota foi inserida");
        }

        input.close();
    }
}
