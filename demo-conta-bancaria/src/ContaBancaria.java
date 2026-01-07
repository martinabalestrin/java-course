import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

        String nome = "Martina Balestrin";
        String tipoConta = "Corrente";
        double saldo = 2500;
        int opcao = 0;
        Scanner leitura = new Scanner(System.in);
        
        String menu = """

        Operações:

        1 - Consultar saldo
        2 - Receber valor
        3 - Transferir valor
        4 - Sair

        Digite a opção desejada: """;

        System.out.println("\n**************************");
        System.out.println("Dados iniciais do cliente:\n");

        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("**************************");

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    // Consultar saldo
                    System.out.println("Seu saldo é de R$ " + saldo);
                    break;

                case 2:
                    // Receber valor
                    System.out.println("Informe o valor a receber:");
                    double receber = leitura.nextDouble();

                    if (receber > 0) {
                        saldo += receber;
                        System.out.println("Saldo atualizado: R$" + saldo);
                    } else {
                        System.out.println("Valor negativo.");
                    }
                    
                    break;

                case 3:
                    // Transferir valor
                    System.out.println("Informe o valor que deseja transferir:");
                    double transferir = leitura.nextDouble();

                    if (0 > transferir) {
                        System.out.println("Valor negativo.");
                    }
                    
                    else if (saldo > transferir) {
                        saldo -= transferir;
                        System.out.println("Saldo atualizado: R$" + saldo);
                    }
                    
                    else {
                        System.out.println("Não há saldo suficiente para realizar essa transferência.");
                    }
                    
                    break;

                case 4:
                    System.out.println("Encerrando...");
                    break;
            
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }

        leitura.close();
    }
}
