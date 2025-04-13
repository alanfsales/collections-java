package main.java.map.OperacoesBasicas;

public class MainAgenda {

    public static void main(String[] args) {
        AgendaContatos ac = new AgendaContatos();

        ac.adicionarContato("Alan", 123456);
        ac.adicionarContato("Cris", 987654);
        ac.adicionarContato("Zé", 555555);

        ac.exibirContatos();

        ac.pesquisarPorNome("Zé");

        ac.removerContato("Zé");

        ac.exibirContatos();
    }
}
