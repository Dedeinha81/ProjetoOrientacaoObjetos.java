public abstract class  Conta implements IConta {
private static final int AGENCIA_PADRAO = 1;
private static int sequencial=1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    /**
     * 
     */
    public Conta(){

        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = sequencial ++;
    
       }
    
    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    @Override
    public void despositar(double valor) {
       this.despositar( + valor);
    }

    @Override
    public void sacar(double valor) {
        this.saldo = - valor;
    }

    @Override
    public void tranferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.despositar(valor);
      
}
protected void extracted() {
    System.out.println(String.format("Agencia:1%d",this.agencia));
    System.out.println(String.format("Numero:1%d",this.numero));
    System.out.println(String.format("Saldo:1%d",this.saldo));
}
}
