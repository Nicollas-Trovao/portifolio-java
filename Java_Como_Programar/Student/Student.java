package Student;

public class Student{

    private String nome;
    private double media;

    public Student(String nome, double media){
        this.nome = nome;

        if (media >= 0){
            if (media <= 100){
                this.media = media;
            }
        }
    }

    public void SetNome(String nome){
        this.nome = nome;
    }

    public String GetNome(){
        return nome;
    }

    public void SetMedia(double mediaAluno){
        if (media >= 0.0){
            if (media <= 100){
                this.media = media;
            }
        }
    }

    public double GetMedia(){
        return media;
    }

    public String GetResultado(){

        String resultado = "";

        if (media >= 90.0){
            resultado = "A";
        } else if (media >= 80.0){
            resultado = "B";
        } else if (media >= 70.0){
            resultado = "C";
        } else if (media >= 60.0){
            resultado = "D";
        } else {
            resultado = "F";
        }

        return resultado;
    }
}