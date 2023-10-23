import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
       
        Menu menu = new Menu();
        Torneio torneio = new Torneio();
        Batalha batalha;
        ArrayList<Criatura> criaturasInimigas = new ArrayList<>();
        Criatura jogador;
        int criaturaEscolhida;
        int turno = 1;
        int contadorBatalha = 0;

        //Exibe menu inicial.
        menu.menuIniciar();
        criaturaEscolhida = menu.menuEscolherCriatura();
        //Interpreta a criatura escolhida.
        jogador = torneio.definirCriatura(criaturaEscolhida);
        System.out.println(jogador);
        //Inicia o torneio.
        menu.menuIniciarTorneio();
        criaturasInimigas = torneio.separarInimigos(jogador);

        for(Criatura criaturaInimiga:criaturasInimigas){
            batalha = new Batalha(jogador, criaturaInimiga);
            menu.menuBatalhar(turno, criaturaInimiga);
            batalha.iniciarBatalha(jogador,criaturaInimiga);
            if(turno < 3){
                menu.menuConfirmarBatalha();
            }
            turno++;
            contadorBatalha++;
           if (contadorBatalha == 3){
            System.out.println("Parabéns, você venceu o torneio!");
            menu.menuIniciar();
        } 
        
    }
  }
}