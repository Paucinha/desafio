package desafiodeprogramacao;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Senha2 {
	public static boolean validaSenha(String senha) {

        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[!@#$%^&*()-+])"
                + "(?=\\S+$).{6}$";

        Pattern p = Pattern.compile(regex);
        
        if (senha == null) {
            return false;
        }
        
        Matcher m = p.matcher(senha);

        return m.matches();
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		 System.out.println("DIGITE SEU NOME");
	     String nome = scanner.next();
	     System.out.println("DIGITE UMA SENHA FORTE");
	     String senha = scanner.next();
	     
	     System.out.println(validaSenha(senha));
    }

	}

