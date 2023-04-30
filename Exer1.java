import java.util.Scanner;

public class Exer1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nota;

        System.out.println("Exercicio um");

        do {
            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = sc.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido. Digite novamente.");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("Nota válida: " + nota );

        sc.close();

    }
    
}