import java.util.Scanner;

public class Exer2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nomeUsuario;
        String senha;

        System.out.println("Exercicio dois");

        System.out.println("informe seu nome de usuário: ");
        nomeUsuario = sc.next();

        do {

            System.out.println("Informe sua senha: ");
            senha = sc.next();

            if (senha.equals(nomeUsuario)) {
                System.out.println("A senha não pode ser igual ao nome de usuário: ");

            }
        } while (senha.equals(nomeUsuario));
        System.out.println("Informações validas");

        sc.close();
    }

}
