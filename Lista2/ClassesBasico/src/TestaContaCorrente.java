public class TestaContaCorrente {
    public static void main (String args[]){
        ContaCorrente conta1 = new ContaCorrente(123456);
        System.out.println("Teste - nro conta: ");
        System.out.println(conta1.getNroConta());

        conta1.deposito(1500);
        System.out.println("Teste - deposito: ");
        System.out.println(conta1.getSaldo());

        conta1.deposito(250);
        System.out.println("Teste - incrementa saldo: ");
        System.out.println(conta1.getSaldo());

        conta1.retirada(5000);
        System.out.println("Teste - retirada: ");
        System.out.println(conta1.getSaldo());

        conta1.retirada(250);
        System.out.println("Teste - decrementa saldo: ");
        System.out.println(conta1.getSaldo());

    }
}
