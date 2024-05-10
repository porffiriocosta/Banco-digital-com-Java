//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Banco bancoInicial = new Banco();

        bancoInicial.setNome("Banco Genial");

        Cliente reginaldo = new Cliente("Porfirio", bancoInicial);
        reginaldo.setNome("Reginaldo P Costa");

        Conta ccorrente = new ContaCorrente(reginaldo);

        ccorrente.depositar(100);

        Cliente simone = new Cliente("Simone", bancoInicial);
        Conta cpoupanca = new ContaPoupanca(simone);

        ccorrente.imprimirExtrato();
        cpoupanca.imprimirExtrato();

        ccorrente.transferir(48, cpoupanca);

        ccorrente.imprimirExtrato();
        cpoupanca.imprimirExtrato();
        bancoInicial.mostrarClientes();

        Cliente eduarda = new Cliente("Eduarda", bancoInicial);
        Conta ccorrente2 = new ContaCorrente(eduarda);
        ccorrente2.imprimirExtrato();
        bancoInicial.mostrarClientes();
    }
}