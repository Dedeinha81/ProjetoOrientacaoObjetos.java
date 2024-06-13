public class Main {
public static void main(String[] args) {
    Conta cc =  new ContaCorrente();
    Conta ContaPoupanca = new ContaPoupanca();
   
    cc.imprimirExtrato();
    ContaPoupanca.imprimirExtrato();
}
}
