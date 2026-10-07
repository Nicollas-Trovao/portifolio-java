package SOFTwares;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class GURPS {

    public static void main(String[] args) {
        Teste.Rolagem(10);
    }

    class Teste{     

        static int rolagem1;
        static int rolagem2;
        static int rolagem3;
        static int rolagem;
        static int margem = 0;

        public static int Rolagem(int alvo){

            Random random = new Random();

            rolagem1 = random.nextInt(6)+1;
            rolagem2 = random.nextInt(6)+1;
            rolagem3 = random.nextInt(6)+1;

            rolagem = rolagem1 + rolagem2 + rolagem3;

            limpar();
            System.out.printf("Rolagem %d + %d + %d = %d%n", rolagem1, rolagem2, rolagem3, rolagem);
                if (rolagem <= alvo && rolagem > 4){

                    margem = alvo - rolagem;
                    if (margem == 0){
                        System.out.printf("Sucesso!");
                    } else {System.out.printf("Sucesso! %nCom uma margem de %d", margem);}

                    sucesso();
                } 
                else if (rolagem <= 4){

                    System.out.printf("SUCESSO CRÍTICO!!!");

                    sucessoCritico();
                } 
                else if (rolagem > alvo && rolagem < 17) {

                    margem = rolagem - alvo;
                    System.out.printf("Falha... %nCom uma margem de %d", margem);

                    falha();
                }
                else if (rolagem >= 17){

                    System.out.printf("Falha Crítica...");

                    falhaCritica();
                }

                return margem;
            
        }

        public static String sucesso(){

            String resultado = "Sucesso";
                    
            return resultado;
        }

        public static String sucessoCritico(){

            String resultado = "SucessoCritico";
                    
            return resultado;
        }

        public static String falha(){

            String resultado = "Falha";
                    
            return resultado;
        }

        public static String falhaCritica(){

            String resultado = "FalhaCritica";
                    
            return resultado;
        }
    }

    

    public static void RdVariavel() {
        Scanner input = new Scanner(System.in);

        String formato = "%nSua RD Variavel é de %1.0fd+%1.0f%n";
        double rd;
        double d;
        double f;

        while (true) {
            limpar();
            System.out.printf("Informe a RD:%n");
            rd = input.nextDouble();
            d = arredondar(rd / 10);
            if (d < 1) d = 1;
            
            f = arredondar(rd - (d * 3.5));
            if (f < 1) {
                formato = "%nSua RD Variavel é de %1.0fd%1.0f%n";
            }
            if (f == 0) {
                formato = "%nSua RD Variavel é de %1.0fd%n";
            }
            System.out.printf(formato, d, f);
            waitForEnter(null);
        }
    }

    private static double arredondar(double rd) {
        return Math.round(rd);
    }

    public static void limpar() {
        try {
            new ProcessBuilder("cmd", "/c", "cls")
                    .inheritIO()
                    .start()
                    .waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void waitForEnter(String message, Object... args) {
        Console c = System.console();
        if (c != null) {
            // printf-like arguments
            if (message != null)
                c.format(message, args);
            c.format("\nPressione Enter.\n");
            c.readLine();
        }
    }

}
