package main.java.set.Pesquisa;

public class MainContatos {

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Contato 1 ", 123123);
        agendaContatos.adicionarContato("Contato 1 ", 6666);
        agendaContatos.adicionarContato("Contato 1 Novo ", 11111111);
        agendaContatos.adicionarContato("Contato 1 Novo 2 ", 654321);
        agendaContatos.adicionarContato("Maria", 11111111);

        agendaContatos.exibirContatos();
        System.out.println();

        System.out.println(agendaContatos.pesquisarPorNome("Contato"));

        agendaContatos.atualizarNumeroContato("Maria", 5555555);

        agendaContatos.exibirContatos();
    }
}
