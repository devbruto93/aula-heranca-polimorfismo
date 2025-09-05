package entities;

public abstract class ContaCorrente {

    private int numeroDaConta;
    private String titular;
    protected double saldo;

    public ContaCorrente(){
    }

    public ContaCorrente(int numeroDaConta, String titular, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void saque(double valor){
        saldo -= valor + 5.0;
    }

    public void deposito(double valor){
        saldo += valor;
    }
}
