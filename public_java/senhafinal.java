package desafiodeprogramacao;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class senhafinal {
	
	 
    //Senha
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		// 1) Informe sua senha
		System.out.println("senha> ");
		String senha = in.nextLine();
		
        //3) Verificar senha
		// senha == "Ya3&ab"
		// Comparação de uma instància (objeto) com uma string
		
		if (senha.equals(" ")) {
			System.out.printf("senha %s inserida com sucesso.", senha);
		}else{
			System.out.println("3");
		}
	}

	}