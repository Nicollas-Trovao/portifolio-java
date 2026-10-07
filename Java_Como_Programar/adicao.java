import java.util.Scanner;
import javax.swing.JOptionPane;

public class adicao {
    
    public static void main(String[] args){

        int num1;
        int num2;
        int som;

        String resp;

        // Criação de Scanner
        Scanner input = new Scanner(System.in);

        resp = JOptionPane .showInputDialog("Digite seu primeiro numero: ");

        num1 = Integer.parseInt(resp);

        resp = JOptionPane .showInputDialog("Digite seu segundo numero: ");

        num2 = Integer.parseInt(resp);

        som = num1 + num2;

        JOptionPane .showMessageDialog(null, "O Resultado é: " +som);

        input.close();

    } // Fim do main
} // Fim da classe Welcome
