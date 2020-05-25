public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Saldo atual da conta: " + this.saldo);
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saldo atual da conta: " + this.saldo);
            return true;
        }
        System.out.println("Saldo insuficiente!");
        return false;
    }

    public boolean transferir(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saldo atual da conta: " + this.saldo);
            destino.depositar(valor);
            return true;
        }
        System.out.println("Saldo insuficiente!");
        return false;
    }
}
