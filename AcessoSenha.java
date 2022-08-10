import java.util.Scanner;

public class AcessoSenha {
    
    public static void main(String[] args) {
        
        String senha, acesso;
        senha = "S3nh4";

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        acesso = ler.next();

        ler.close();

        if (senha.equals(acesso)) {
            System.out.println("Acesso Concedido");
        } else {
            System.out.println("Acesso Negado");
        }

    }
}
