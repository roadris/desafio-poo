package interfaces;
public interface AparelhoTelefonico {
    public void ligar (String numero);
    public void atender();
    public void iniciarCorreioVoz();
    public void selecionarCorreioVoz(String numero);
    public void armazenarNumeroFavoritos(String numero);
    public void listarLigacoesPerdidas();

}
