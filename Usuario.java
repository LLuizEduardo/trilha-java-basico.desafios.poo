public class Usuario {
    public void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar("000000000");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("musica qualquer");

        iphone.exibirPagina("dio.me");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
