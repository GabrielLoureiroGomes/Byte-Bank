public class CriaConta {

    public static void main(String[] args) {
        Conta contaDoGabriel = new Conta();
        Conta contaDaJessica = new Conta();
        contaDoGabriel.depositar(500);
        contaDaJessica.depositar(800);
        contaDaJessica.transferir(5000, contaDoGabriel);
    }
}
