package poo;

public class iPhone {
    public static void main(String[] args) {
        ReprodutorMusical reprodutorMusical =new ReprodutorMusical();
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        NavegadorInternet navegadorInternet = new NavegadorInternet();

        reprodutorMusical.selecionarMusica();
        reprodutorMusical.pausa();
        reprodutorMusical.tocar();

        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        navegadorInternet.exibirPagina();
        navegadorInternet.atualizarPagina();
        navegadorInternet.adicionarNovaAba();

    }
}
