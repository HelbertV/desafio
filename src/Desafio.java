import java.sql.SQLOutput;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Hugo Souza";
        String tipoConta = "Corrente";
        double saldo = 1500.75;
        int opcao = 0;

        System.out.println("****************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n****************************");

        String menu = """
                ** Digite a opção desejada **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair

                """;

        Scanner leitura = new Scanner(System.in);

        while(opcao!= 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atual é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar transferência");
                } else {
                    saldo -= valor;
                    System.out.println("O novo saldo da sua conta é " + saldo);
                }
            }else if(opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo é " + saldo);
            } else if(opcao != 4) {
                System.out.println("Opção inválida");
            }
        }

    }
}
