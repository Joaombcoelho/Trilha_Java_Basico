    import java.util.Locale;
    import java.util.Scanner;
    
    public class ContaTerminal {
        public static void main(String[] args) {
        
            double saldo = 237.48;
            double conta = 1067.8;
            //criando o objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            
            System.out.println("Numero da Agencia");
            int agencia = scanner.nextInt();
            
            //imprimindo os dados obtidos pelo usuario
            System.out.println("Ola, MARIO ANDRADE " + "obrigado por criar uma conta em nosso Banco.");
            System.out.println("Agência Número " + agencia); 
            System.out.println("Conta Numero " + conta);
            System.out.println("O seu saldo de " + saldo + " já esta disponivel para saque");
            System.out.println("Para Sacar Digite Sim");
            System.out.println("Para encerrar o atendimento digite Exit");
           
            
        }
    
}
