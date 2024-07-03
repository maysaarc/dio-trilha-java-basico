import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {    
        //TODO: Conhecer e importar a classe Scanner

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o usuário
        //Obter pela scanner os valores digitados

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();
        /*System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();
        String nomeCliente = nome + " " + sobrenome;*/

        System.out.println("Digite sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        //Exibir a mensagem da conta criada

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");

    }
}
