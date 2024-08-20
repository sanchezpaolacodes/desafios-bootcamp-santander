package desafio3_CondicoesLoopsExcecoes;

import java.util.Scanner;

public class VerificacaoChequeEspecial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saldoConta = scanner.nextInt();
        int valorDoDeposito = scanner.nextInt();

        if (saldoConta >= valorDoDeposito) {
            System.out.println("Transacao realizada com sucesso.");
        } else if (valorDoDeposito > (saldoConta + 500)) {
            System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        } else {
            System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
        }
        scanner.close();
    }
}
