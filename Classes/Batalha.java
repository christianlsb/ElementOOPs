import java.util.Random;

public class Batalha {
    // Atributos
    private Criatura jogador;
    private Criatura criaturaInimiga;
    private Menu menu;
    private int turno;
    private int numJogador;
    private int numcriaturaInimiga;
    private Random random;

    public Batalha(Criatura jogador, Criatura criaturaInimiga) {
        this.menu = new Menu();
        this.random = new Random();
        this.jogador = jogador;
        this.criaturaInimiga = criaturaInimiga;
        this.numcriaturaInimiga = random.nextInt();
        this.numJogador = random.nextInt();
    }
    public void atacar(Criatura jogador, Criatura criaturaInimigo){
        int escolhaAtaque = menu.menuAtacarBatalha();
        if(escolhaAtaque == 1){
            jogador.atacarFisicamente(criaturaInimigo);
        }else{
            jogador.atacarElementalmente(criaturaInimigo);
        }
    }
    public void iniciarBatalha(Criatura jogador, Criatura criaturaInimiga) {
        menu.menuMaiorVelocidade(jogador, criaturaInimiga);

        if(jogador.getVelocidade() >= criaturaInimiga.getVelocidade()){
            System.out.println("Você começa!");
            do{
                System.out.println(jogador);
                System.out.println(criaturaInimiga);
                int escolhaAtaque = menu.menuAtacarBatalha();
                if(escolhaAtaque == 1){
                    jogador.atacarFisicamente(criaturaInimiga);
                    System.out.println(jogador);
                    System.out.println(criaturaInimiga);
                }else if(escolhaAtaque == 2){
                    jogador.atacarElementalmente(criaturaInimiga);
                }
                int escolhaAtaqueCriatura = random.nextInt(1) + 1;
                if(escolhaAtaqueCriatura == 1){
                    criaturaInimiga.atacarFisicamente(jogador);
                    System.out.println(jogador);
                    System.out.println(criaturaInimiga);
                }else if(escolhaAtaqueCriatura == 2){
                    criaturaInimiga.atacarElementalmente(jogador);
                }
                //------------------------------------------------------------
                if (criaturaInimiga.getPontosVida() <= 0) {
                    System.out.println("A criatura inimiga foi derrotada!");
                    break;
                }else if(jogador.getPontosVida() <= 0){
                    System.out.println("Você foi derrotado.\nSeus pontos de vida chegaram a 0.");
                    break;
                }else{
                    break;
            }
            }while (jogador.getPontosVida() > 0 || criaturaInimiga.getPontosVida() > 0);
        } 
    } // Fim do método iniciarBatalha
} // Fim da classe Batalha
