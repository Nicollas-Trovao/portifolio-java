import java.util.Scanner;

public class CalculadoraIMC {
    
    public static void main(String[] args){
        CalculadoraIMC calculadora = new CalculadoraIMC();

        calculadora.dados();

    }

    public void dados(){
        
        Double altura;
        Double peso;

        Scanner input = new Scanner(System.in);

        System.out.println("Qual seu peso?");
        peso = input.nextDouble();

        System.out.println("Qual sua altura?");
        altura = input.nextDouble();

        Double resultado = calculo(altura, peso);

        System.out.printf("Seu IMC é %.2f %n", resultado);
        System.out.printf(
        "IMC Valores %n%s%n%s%n%s%n%s%n", 
        "Abaixo do Peso: 18.5 ou menos",
        "Normal : Entre 18.5 e 24.9",
        "Acima do peso: Entre 25 e 29.9",
        "Obeso: 30 ou mais"    
        );

        input.close();
    }

    
    public Double calculo(Double altura, Double peso){

        Double resultado = peso / (altura * altura);
        return resultado;
    }

}
