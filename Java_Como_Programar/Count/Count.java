package Count;

public class Count {

    private String nome;
    private Double saldo;

    public Count(String nome, Double saldo){
        this.nome = nome;

        if (saldo > 0.0){
            this.saldo = saldo;
        }
    }

    public void depositar(Double deposito){
        if (deposito > 0.0){
            saldo = saldo + deposito;
        }

    }

    // Encapsulamento da instancia nome
    // Atribuir o nome da Count
    public void Setnome(String nome){
        this.nome = nome;
    }// Fim do set

    // Recupar o nome da Count
    public String Getnome(){
        return nome;
    } 
    public Double Getsaldo(){
        return saldo;
    }
    
    // Fim do get

}// fim da Count

