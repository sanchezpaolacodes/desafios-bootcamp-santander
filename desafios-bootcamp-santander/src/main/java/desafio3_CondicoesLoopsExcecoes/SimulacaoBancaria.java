package desafio3_CondicoesLoopsExcecoes;

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor, saldoAtual=0;;
        boolean continuar = true;

        /*
        O exercicio nao passa no teste de aberto se tiver esse menu:

        System.out.println("Bem-vindo ao simulador bancário!");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Consultar Saldo");
        System.out.println("0 - Encerrar");
        */

        while (continuar) {
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    valor = scanner.nextDouble();
                    saldoAtual += valor;
                    System.out.println("Saldo atual: " + saldoAtual);
                    break;
                case 2:
                    valor = scanner.nextDouble();

                    if(valor <= saldoAtual){
                        saldoAtual -= valor;
                        System.out.println("Saldo atual: "  + saldoAtual);
                    }else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: "  + saldoAtual);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}