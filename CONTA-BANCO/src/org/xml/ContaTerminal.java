package org.xml;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (java.util.Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, digite o numero da conta:");
            int numero = scanner.nextInt();
            
            scanner.nextLine(); // Consume the newline left-over
            
            System.out.println("Por favor, digite o numero da Agencia:");
            String agencia = scanner.nextLine();
            
            System.out.println("Por favor, digite o nome do cliente:");
            String nomeCliente = scanner.nextLine();
            
            System.out.println("Por favor, digite o saldo:");
            double saldo = scanner.nextDouble();
            
            System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agencia e " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " ja esta disponivel para saque.");
        }
    }
}
