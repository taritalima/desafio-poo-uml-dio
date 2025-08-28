public class Iphone implements  AparelhoTelefonico, NavegadorDaInternet, ReprodutorMusical {


    @Override
    public void ligar(String numero) {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação..");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando");
    }

    @Override
    public void selecionarMusica(String Musica) {
        System.out.println("Selecionando Musica");
    }
}
