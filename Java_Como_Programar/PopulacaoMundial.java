public class PopulacaoMundial {
    
    public static void main(String[] args){

        Double populacao = 8.31;
        Double porcentagem = 0.85;
        System.out.printf("A População Mundial é de: %.2f%s", populacao, " Bilhões");

        System.out.printf("%nEm Um Ano, a População Mundial será: %.2f %s", populacao * (1+(porcentagem / 100)), "Bilhões");
        System.out.printf("%nEm Dois Anos, a População Mundial será: %.2f %s", populacao * (1+(porcentagem * 2 / 100)), "Bilhões");
        System.out.printf("%nEm Três Anos, a População Mundial será: %.2f %s", populacao * (1+(porcentagem * 3 / 100)), "Bilhões");
        System.out.printf("%nEm Quatro Anos, a População Mundial será: %.2f %s", populacao * (1+(porcentagem * 4 / 100)), "Bilhões");
        System.out.printf("%nEm Cinco Anos, a População Mundial será: %.2f %s", populacao * (1+(porcentagem * 5 / 100)), "Bilhões");
    }
}
