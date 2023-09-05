import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela Scanner os valores digitados no terminal
        Scanner Conta = new Scanner(System.in);

        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.printf("\nPor favor, digite o número da agência!\n");
        agencia = Conta.next();

        System.out.printf("\nPor favor, digite o seu nome!\n");
        nomeCliente = Conta.next();

        System.out.printf("\nPor favor, digite o número da conta!\n");
        numero = Conta.nextInt();

        System.out.printf("\nPor favor, digite o seu saldo!\n");
        saldo = Conta.nextDouble();

        System.out.printf("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua Agência é " + agencia + ", Conta " + numero + " e seu Saldo de " + saldo + " já está disponível para saque.\n\n");
        
        Conta.close();        
    }
}
