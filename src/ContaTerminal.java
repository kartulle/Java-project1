import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public void criarConta() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println("Agora nos informe sua conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Qual o seu nome?");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque!");
    }
}
