// 1 - Crie uma classe ContaCorrente com os métodos solicitados

public class ContaCorrente {
    private double saldo = 0.0;
    private int nroConta;

    public ContaCorrente(int nro){
        nroConta = nro;
    }
    public void deposito(double valor){
        if(valor > 0){
            saldo += valor;
        }
    }
    public double retirada (double valor){
        if(saldo - valor >= 0){
            saldo -= valor;
        }
        return saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public int getNroConta(){
        return nroConta;
    }
}
