package GUIs;

import javax.swing.JOptionPane;

public class Dialog1 {

    public static void main(String[] args){
        //Caixa de dialogo
        JOptionPane .showMessageDialog(null, "Olá");
        String nome = JOptionPane .showInputDialog("Qual seu nome?");

        String mensagem = 
            String.format("Bem vindo, %s, ao Java!", nome);

        JOptionPane .showMessageDialog(null, mensagem);
    }
    
}
