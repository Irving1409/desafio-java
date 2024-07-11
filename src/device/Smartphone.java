package device;

import operadores.AparelhoTelefonico;
import operadores.NavegadorInternet;
import operadores.ReprodutorMusical;

public class Smartphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public void tocar(){
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
        
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
        
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + " ...");
        
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página Atualizada");
        
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
        
    }
    
}
