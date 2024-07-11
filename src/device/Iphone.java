package device;

public class Iphone {
    public static void main(String[] args) {
        Smartphone apple = new Smartphone();

        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("Testando Reprodutor de Músicas");
        System.out.println("+++++++++++++++++++++++++++++++++");
        apple.tocar();
        apple.pausar();
        apple.selecionarMusica("Musica 1");

        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("Testando Telefone");
        System.out.println("+++++++++++++++++++++++++++++++++");
        apple.ligar("33333333");
        apple.atender();
        apple.iniciarCorreioVoz();

        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("Testando Navegador");
        System.out.println("+++++++++++++++++++++++++++++++++");
        apple.exibirPagina("https://teste.com.br");
        apple.adicionarNovaAba();
        apple.atualizarPagina();
    }
}
