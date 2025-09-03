package Application;


import entities.ContaCorrente;
import entities.ContaPoupanca;
import entities.ContaSalario;

public class Main {
    public static void main(String[] args) {

        /*
        ContaCorrente cc1 = new ContaCorrente(1111, "Douglas", 5000.0);
        cc1.saque(100.0);
        System.out.println(cc1.getSaldo());

        ContaCorrente cc2 = new ContaPoupanca(1112, "Natalia", 6000.0, 0.5);
        cc2.saque(100.0);
        System.out.println(cc2.getSaldo());

        ContaCorrente cc3 = new ContaSalario(1113, "Vinicius", 4000.00, 2500.0);
        cc3.saque(100.0);
        System.out.println(cc3.getSaldo());
         */

        //APLICANDO O POLIMORFISMO
        ContaCorrente exemplo1 = new ContaCorrente(1111, "Douglas", 1000.0);
        ContaCorrente exemplo2 = new ContaPoupanca(1112,"Natalia", 1000.0, 0.01);

        exemplo1.saque(100.0);
        exemplo2.saque(100.0);

        System.out.println("Saldo atual do Douglas " + exemplo1.getSaldo());
        System.out.println("Saldo atual da Natalia " + exemplo2.getSaldo());
    }
}
