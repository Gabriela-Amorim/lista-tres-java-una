import java.util.Scanner; 

public class Exer3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        boolean validator = false;
        int idade;
        double salario;
        String nome, erro = ""; 
        char sexo, estadoCivil;

        System.out.println("Exercicio três");
        
        do {
            System.out.println("Informe o nome: ");
            nome = sc.next();
            if (nome.length() < 3) {
                erro += "O nome precisa ter mais de 3 caracteres.\n" ;
             }

            System.out.println("Informe a idade: ");
            idade = sc.nextInt();
            if (idade < 0 || idade > 150){
            erro += "Idade precisa ser entre 0 e 150.\n";
             }

            System.out.println("Informe o salário: ");
            salario = sc.nextDouble();
            if (salario <= 0) {
                erro += "Salario precisa ser maior que zero.\n";
            }

            System.out.println("Informe o sexo: F para feminino e M para masculino ");
            sexo = sc.next().charAt(0);
            if (sexo != 'M' && sexo != 'F'){
                erro += "Digite F para feminino ou M para masculino.\n";
            }

            System.out.println("Informe o estado civil: C (casado), S (solteiro), V (viúvo) e D (divorciado)");
            estadoCivil = sc.next().charAt(0);
            if (estadoCivil != 'C' && estadoCivil != 'S' && estadoCivil != 'V' && estadoCivil != 'D'){
                erro += "Digite C para casado, S para solteiro, V para viúvo ou D para divorciado.\n";
            }

            if (erro.length() > 0){
                System.out.println(erro);
                System.out.println("tente novamente");
                validator = true;
            }

        }   while (validator);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado civil: " + estadoCivil);
        
        sc.close();
        

    }
    
}
