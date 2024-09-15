import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: "); int numeroAgencia = scan.nextInt();
        scan.nextLine();
        System.out.print("Por favor, digite a sua Agência: "); String agencia = scan.nextLine();
        System.out.print("Por favor, digite o nome do Cliente: "); String nomeCliente = scan.nextLine();
        System.out.print("Por favor, digite o saldo do Cliente: "); double saldo = scan.nextDouble();
        scan.nextLine();

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.print("sua agência é " + agencia + ", conta " + numeroAgencia + " e seu saldo " + saldo);
        System.out.println(" já está disponível para saque.");

        scan.close();
    }
}
