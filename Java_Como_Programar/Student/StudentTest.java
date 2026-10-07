package Student;

public class StudentTest {

    public static void main(String[] args){

        Student estudante1 = new Student("Nicollas", 92.00);
        Student estudante2 = new Student("Carlos", 78.00);

        System.out.printf("%s%n%s%s%n", estudante1.GetNome(), "Nota: ", estudante1.GetResultado());
        System.out.printf("%s%n%s%s%n", estudante2.GetNome(), "Nota: ", estudante2.GetResultado());
    }
}