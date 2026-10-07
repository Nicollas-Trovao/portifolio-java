package Pseudocodigos;

import java.util.Scanner;

public class SistemaBanco {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double saldo = 1000.00;
        int opcao = 0;

        while (true){
            System.out.printf("%n1 - Consultar Saldo %n");
            System.out.printf("2 - Depositar %n");
            System.out.printf("3 - Sacar %n");
            System.out.printf("4 - Transferir %n");
            System.out.printf("0 - Sair %n");

            opcao = input.nextInt();

            if (opcao == 1){
                System.out.printf("Seu saldo é de %.2f %n", saldo);
            }
            else if (opcao == 2){
                while (true){
                    System.out.printf("Quanto deseja Depositar? %n");
                    double valor = input.nextDouble();
                    if (valor > 0){
                        saldo = saldo + valor;
                        System.out.printf("Seu saldo agora é de %.2f %n", saldo);
                        break;
                    } else {
                        System.out.printf("Numero invalido, digite um Valor maior que 0 %n");
                    }
                }
            }
            else if (opcao == 3){
                while (true) {
                    System.out.printf("Quanto deseja Sacar? %n");
                    double valor = input.nextDouble();
                    if (valor > 0){
                        if (valor <= saldo){
                            saldo = saldo - valor;
                            System.out.printf("Você sacou %.2f%n%s%.2f", valor, "Seu saldo agora é de ", saldo);
                            break;
                        } else {
                            System.out.printf("Valor invalido, Saldo insuficiente %n");
                        }
                    } else {
                        System.out.printf("Numero invalido, digite um Valor maior que 0 %n");
                    }
                }
            }
            else if (opcao == 4){
                while (true){
                    System.out.printf("Quanto deseja transferir? %n");
                    double valor = input.nextDouble();
                    if (valor > 0){
                        if (valor <= saldo){
                            saldo = saldo - valor;
                            System.out.printf("Transferência realizada com sucesso... %nSeu saldo agora é de: %.2f", saldo);
                            break;
                        } else {
                            System.out.printf("Valor invalido, Saldo insuficiente");
                        }
                    } else {
                        System.out.printf("Numero invalido, digite um Valor maior que 0 %n");
                    }
                }
            }
            else if (opcao == 0){
                System.out.printf("Encerrando...");
                break;
            } else {
                System.out.printf("Opção Invalida...");
            }
        } 

        input.close();
    }
}
