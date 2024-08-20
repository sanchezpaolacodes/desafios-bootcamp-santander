package desafio2_ControleFluxo;

import java.util.Scanner;

public class Contador {

    public static void verificarParametros() throws ParametrosInvalidosException {
        Scanner scanner = new Scanner(System.in);

        try{
        int primeiroParametro, segundoParametro;
        System.out.println("Digite dois numeros, sendo o primeiro menor q o segundo:");
        primeiroParametro = scanner.nextInt();
        segundoParametro = scanner.nextInt();
        System.out.println(String.format(
                "Você digitou os números: %s e %s",
                primeiroParametro, segundoParametro));

        if(primeiroParametro > segundoParametro){
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }

        for(int i = primeiroParametro ; i <= segundoParametro ; i++){
            System.out.println("Imprimindo o número: " + i);
        }
        } finally {
            scanner.close();
        }

    }

    public static void main(String[] args) {
        try{
            verificarParametros();
        }catch (ParametrosInvalidosException exception){
            System.out.println("Erro: " + exception.getMessage());
        }
    }

}
