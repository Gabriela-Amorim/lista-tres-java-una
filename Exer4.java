import java.util.Scanner; 

public class Exer4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int quantidadeNumeros = 5, numero, soma = 0;
        double media;

        System.out.println("Exercício quatro");

        for (int i = 1; i <= quantidadeNumeros; i++) {
            System.out.println("Digite o " + i + "º número: ");
            numero = sc.nextInt();
            soma += numero;
        }
        media = (double) soma / quantidadeNumeros;

        System.out.println("Soma dos números: " + soma);
        System.out.println("Média dos números: " + media);

        sc.close();
    }
    
}