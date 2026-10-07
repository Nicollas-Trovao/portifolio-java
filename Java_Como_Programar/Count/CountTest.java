package Count;

import java.util.Scanner;

public class CountTest {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Count minhaConta1 = new Count("Usuário", 0.47);
        
        System.out.printf("Nome: %s || Saldo: $%.2f %n", 
        minhaConta1.Getnome(), minhaConta1.Getsaldo());
        System.out.println("Digite o valor a ser depositado: ");
        Double deposito = input.nextDouble();

        minhaConta1.depositar(deposito);

        System.out.println("Seu saldo agora é de: " +minhaConta1.Getsaldo());

    }
}
