package desafio1_ContaBanco;

import java.util.Scanner;

//Simulando Uma Conta Bancária Através Do Terminal/Console
public class ContaTerminal {
        public static void main(String[] args) {
            int numeroConta;
            String agencia;
            String nomeCliente;
            double saldo = 237.48;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Por favor, digite o número da Agência!");
            agencia = scanner.nextLine();

            System.out.println("Por favor, digite o número da Conta!");
            numeroConta = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Por favor, digite seu nome");
            nomeCliente = scanner.next();

            scanner.close();

            String saldoFormatado = String.format("%.2f", saldo);

            String mensagemSaudacao = String.format(
                    "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo no valor de R$ %s já está disponível para saque.",
                    nomeCliente, agencia, numeroConta, saldoFormatado);

            System.out.println(mensagemSaudacao);
        }
}
