import java.util.Scanner;

public class exercicios1 {

    public static void main(String[] args){
        terceiro();
    }

    static void primeiro(){
        Scanner input = new Scanner(System.in);

        int c = 0;
        int thisIsAVariable;
        int  q76354;
        int number = 1;

        int value = input.nextInt();

        if (number != 7)
            System.out.println("This variable number is not esqual to 7");
        
        if (c < 7); 
            System.out.println("c is less than 7");

        if (c >= 7) 
            System.out.println("c is equal to or greater than 7");
    }

    static void segundo(){

        System.out.println("This is a Java Program");
        System.out.printf("%s%s", "This is a Java", "Program");
    }

    static void terceiro(){

        Scanner input = new Scanner(System.in);

        //Calcula o produto de três inteiros
        int x;
        int y;
        int z;

        int result;

        System.out.print("Digite o Valor de x: ");
        x = input.nextInt();
        System.out.print("Digite o Valor de y: ");
        y = input.nextInt();
        System.out.print("Digite o valor de z: ");
        z = input.nextInt();

        result = x * y;
        result = z * result;
        System.out.println("O produto dos três inteiros é: " +result);
    }
}