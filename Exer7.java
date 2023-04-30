import java.util.Scanner; 

public class Exer7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantidadeNumeros = 10, numero, par = 0, impar = 0;
        
        System.out.println("Exercício sete");

        for (int i = 1; i <= quantidadeNumeros; i++) {
            System.out.println("Digite o " + i + "º número: ");
            numero = sc.nextInt();
            if (numero %2 == 0)
            par += 1;
            else 
            impar += 1;}

            System.out.println("Quantidade de números pares: " + par);
            System.out.println("Quantidade de números ìmpares: " + impar);

        sc.close();
    }
    
}
