import java.util.Scanner; 

public class Exer6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        
        int numero1, numero2;

        System.out.println("Exercicio seis");

        System.out.println("Informe o primeiro número: ");
        numero1 = sc.nextInt();

        System.out.println("Informe o segundo número: ");
        numero2 = sc.nextInt();

        for (int i = numero1 + 1; i < numero2; i++){
            System.out.println(i);
        }
        sc.close();
    }
    
}
