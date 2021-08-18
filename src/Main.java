public class Main {
    public static void main(String[] args) {
        Cliente henrique = new Cliente();
        henrique.setNome("Henrique");

        Cliente jaqueline = new Cliente();
        jaqueline.setNome("Jaqueline");

        Conta cc = new ContaCorrente(henrique);
        Conta cp = new ContaPoupanca(henrique);

        Conta ccj = new ContaCorrente(jaqueline);
        Conta cpj = new ContaPoupanca(jaqueline);

        cp.depositar(10);
        cc.depositar(10);

        ccj.depositar(10);
        cpj.depositar(10);

        cc.transferir(10, cp);
        cc.extrato();
        cp.extrato();



    }
}
