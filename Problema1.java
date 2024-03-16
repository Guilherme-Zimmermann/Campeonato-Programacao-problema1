package problema1;
public class Problema1 {
    public static void main(String[] args) {
        
        double valorBase = 1372.22;

        double valorIMCS = valorBase * 0.175;
        double valorIPI = valorBase * 0.07;
        double valorPIS = valorBase * 0.0375;
        double valorCOFINS = valorBase * 0.04;

        double valorTotal = valorBase + valorIMCS + valorIPI + valorPIS + valorCOFINS;

        System.out.printf("Valor total da nota fiscal: R$%.2f%n", valorTotal);
        System.out.printf("Valor do ICMS: R$%.2f%n", valorIMCS);
        System.out.printf("Valor do IPI: R$%.2f%n", valorIPI);
        System.out.printf("Valor do PIS: R$%.2f%n", valorPIS);
        System.out.printf("Valor do COFINS: R$%.2f%n", valorCOFINS);
        
    }
}