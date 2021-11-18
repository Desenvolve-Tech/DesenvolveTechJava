public class TestaCadastroDeContas {
    public static void main (String args[]){
        CadastroDeContas cadastro = new CadastroDeContas();
        System.out.println("Teste - Cadastra conta");
        ContaCorrente conta1 = new ContaCorrente(123456);
        conta1.deposito(1000);
        cadastro.novaContaCorrente(conta1);

        ContaCorrente conta2 = new ContaCorrente(123457);
        System.out.println(conta2.getNroConta());

        System.out.println("Teste - Recupera conta inválida");
        System.out.println(cadastro.getConta(666666));

    }
}
