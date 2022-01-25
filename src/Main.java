public class Main {

    public static void main(String[] args){
        Conta cc = new ContaCorrente(new Cliente("João"));
        Conta poupanca = new ContaPoupanca(new Cliente("Pedro"));

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
