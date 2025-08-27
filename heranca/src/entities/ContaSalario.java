package entities;

public class ContaSalario extends  ContaCorrente{

    private double limiteDeEmprestimo;

    public ContaSalario(){
        //caso houver alguma logica no contrutor de ContaCorrent apagar o comentario e deixar somente o "super();"
    }

    public ContaSalario(int numeroDaConta, String titular, double saldo, double limiteDeEmprestimo) {
        super(numeroDaConta, titular, saldo);
        this.limiteDeEmprestimo = limiteDeEmprestimo;
    }

    public double getLimiteDeEmprestimo() {
        return limiteDeEmprestimo;
    }

    public void setLimiteDeEmprestimo(double limiteDeEmprestimo) {
        this.limiteDeEmprestimo = limiteDeEmprestimo;
    }

    public void emprestimo(double valor){
        if (valor <= limiteDeEmprestimo)
            saldo += valor - 10.0;
    }
}
