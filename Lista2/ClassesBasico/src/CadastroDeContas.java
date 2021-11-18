public class CadastroDeContas {
    private ContaCorrente[] cadastro = new ContaCorrente[100];
    private int nroContas = 0;

    public boolean novaContaCorrente(ContaCorrente conta) {
        boolean resultado = false;

        if (nroContas < 100 || conta != null) {
            cadastro[nroContas] = conta;
            nroContas++;
            resultado = true;
        }
        return resultado;
    }

    public ContaCorrente getConta(int nro) {
        ContaCorrente resultado;
        int i;
        for (i = 0; i < nroContas; i++)
            if (nro == cadastro[i].getNroConta())
                break;
        if (i == nroContas)
            resultado = null;
        else
            resultado = cadastro[i];
        return resultado;
    }
}
