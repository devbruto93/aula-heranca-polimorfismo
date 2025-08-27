package entities;

public class ContaPoupanca extends ContaCorrente{

    private double taxaDeJuros;

    public ContaPoupanca(){
        //caso houver alguma logica no contrutor de ContaCorrent apagar o comentario e deixar somente o "super();"
    }

    public ContaPoupanca(int numeroDaConta, String titular, double saldo, double taxaDeJuros) {
        super(numeroDaConta, titular, saldo);
        this.taxaDeJuros = taxaDeJuros;
    }

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public void atualizaSaldo(){
        saldo += saldo * taxaDeJuros;
    }

    @Override
    public void saque(double valor){
        saldo -= valor; //sobrescrevento o metodo saque da ContaCorrente porem sem um desconto de 5.0 por saque
    }

}
