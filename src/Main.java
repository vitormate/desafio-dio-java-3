import iphone.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.selecionarMusica("música");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("1234");
        iphone.iniciarCorreioVoz();
        iphone.atender();

        iphone.exibirPagina("google");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
    }
}