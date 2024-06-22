import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    double saldo = 0; 
    Scanner scanner = new Scanner(System.in);
    //TODO: Conhecer e importar a classe scannerdone
    //Exibir as mensagens para nosso usuário.
    //obter pela classe scanner os valores digitados no terminal.
    //Exibir a mensagem final, da conta criada.
    System.out.println("Por favor, digite o número da Agência !");
    String agencia = scanner.next();

    System.out.println("Por favor, digite o número da Conta !");
    String conta = scanner.next();

    System.out.println("Por favor, digite o seu nome !");
    String nome = scanner.next();

    System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+conta+" e seu saldo "+saldo+" já está disponível para saque");

    }
}
