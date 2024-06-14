package main;
public class iPhone  extends TodasInterfaces {
    public static void main(String[] args) {
        
        TodasInterfaces todasInterfaces = new TodasInterfaces();

        System.out.println("Volume atual é: " + todasInterfaces.volume);
        todasInterfaces.aumentarVolume();
        todasInterfaces.aumentarVolume();
        System.out.println();

        //Métodos do ReprodutorMusical
        System.out.println("Reprodutor Musical");
        System.out.println();
        todasInterfaces.tocar("Música 01");
        todasInterfaces.pausar();
        todasInterfaces.selecionarMusica("Música 02");
        todasInterfaces.selecionarCapa("Música 02");
        System.out.println();

        //Métodos do AparelhoTelefonico
        System.out.println("Aparelho Telefônico");
        System.out.println();
        todasInterfaces.ligar("(35) 12345-6789");
        todasInterfaces.atender();
        todasInterfaces.aumentarVolume();
        todasInterfaces.iniciarCorreioVoz();
        todasInterfaces.selecionarCorreioVoz("(35) 12345-6789");
        todasInterfaces.armazenarNumeroFavoritos("(35) 12345-6789");
        todasInterfaces.listarLigacoesPerdidas();
        System.out.println();

        todasInterfaces.diminuirVolume();
        todasInterfaces.diminuirVolume();
        //Métodos do NavegadorInternet
        System.out.println("Navegador da Internet");
        System.out.println();
        todasInterfaces.exibirPagina("www.dio.me");
        todasInterfaces.adicionarNovaAba();
        todasInterfaces.atualizarPagina();
        todasInterfaces.adicionarUrlFavoritos("www.dio.me");
        

                
    }
    
   
   


}
