import java.util.Scanner; 

public class Exer5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int contador = 1;

        System.out.println("Exercício cinco");

        while (true) {
            if (contador %2 != 0)
            System.out.println("Números ímpares:" + contador);
            contador++;

            if (contador > 50)
            break;
        }
        sc.close();
    }
}
