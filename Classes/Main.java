public class Main {
    public static void main (String[] args){
       
        Menu menu = new Menu();
        Torneio torneio = new Torneio();

        Criatura jogador;
        Criatura computador;
        int criaturaEscolhida;

        //Exibe menu inicial.
        menu.menuIniciar();
        criaturaEscolhida = menu.menuEscolherCriatura();
        //Interpreta a criatura escolhida.
        jogador = torneio.definirCriatura(criaturaEscolhida);
        //Inicia o torneio.
        menu.menuIniciarTorneio();
        torneio.escolherInimigo(jogador);






    }
}
