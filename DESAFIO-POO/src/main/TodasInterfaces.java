package main;
import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class TodasInterfaces implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    int volume = 20;

    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentando o volume. O volume atual é: " + volume);
    }

    public void diminuirVolume(){
        volume --;
        System.out.println("Diminuindo o volume. O volume atual é: " + volume);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página url :" + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    @Override
    public void adicionarUrlFavoritos(String url) {
        System.out.println("Sua página: "+ url + " foi adicionada na barra de favoritos.");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Discando para: "+ numero);
    }

    @Override
    public void atender() {
       System.out.println("Atendendo ligação.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    @Override
    public void selecionarCorreioVoz(String numero) {
        System.out.println("Ouvindo o correiro de voz do número: "+ numero);
    }

    @Override
    public void armazenarNumeroFavoritos(String numero) {
        System.out.println("O número: "+ numero + " foi adicionado a lista de favoritos.");
    }

    @Override
    public void listarLigacoesPerdidas() {
        System.out.println("Essas foram suas ligações perdidas: Número 01 - Número 02 - Número 03 ...");
    }

    @Override
    public void tocar(String musica) {
        System.out.println("Tocando música: "+ musica);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: "+ musica);
    }

    @Override
    public void selecionarCapa(String musica) {
        System.out.println("Selecionando a capa da música: "+ musica);
    }
}
