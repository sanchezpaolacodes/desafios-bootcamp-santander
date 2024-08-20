package desafio3_CondicoesLoopsExcecoes;

import java.util.Scanner;

public class ControleSimplesDeSaques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double limiteSaqueDiario, valorDoSaque, valorAcumuladoDeSaques = 0, limiteRestanteParaSaque=0;
        boolean transacao = true;
        limiteSaqueDiario = scanner.nextDouble();
        limiteRestanteParaSaque=limiteSaqueDiario;

        while (transacao){
            valorDoSaque = scanner.nextDouble();
            limiteRestanteParaSaque = limiteRestanteParaSaque - valorDoSaque;
            valorAcumuladoDeSaques += valorDoSaque;
            if(valorDoSaque==0){
                System.out.println("Transacoes encerradas.");
                transacao=false;
            }else if(valorAcumuladoDeSaques>limiteSaqueDiario){
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                transacao=false;
            }else{
                System.out.println("Saque realizado. Limite restante: " + limiteRestanteParaSaque);
            }
            }
        }






        /*


        while (transacao){
            double valorSaque = scanner.nextDouble();
            double saldo = limiteDiario - valorSaque;
            if(valorSaque < saldo){
                System.out.println("Saque realizado. Limite restante: " + saldo);
                if(valorSaque == 0){
                    System.out.println("Transacoes encerradas.");
                    transacao = false;
                }
            } else {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                transacao = false;

            }

        }*/
    }

