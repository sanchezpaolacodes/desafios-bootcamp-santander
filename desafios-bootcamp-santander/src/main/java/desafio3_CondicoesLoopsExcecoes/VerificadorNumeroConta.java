package desafio3_CondicoesLoopsExcecoes;

import java.util.Scanner;

public class VerificadorNumeroConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numeroConta = scanner.nextLine();
        verificarTamanhoConta(numeroConta);

        scanner.close();
    }

    public static void verificarTamanhoConta(String numeroConta) throws IllegalArgumentException{
        if(numeroConta.length() !=8){
            System.out.println("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
        }else{
            System.out.println("Numero de conta valido.");
        }

    }
}
