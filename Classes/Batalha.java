import java.util.Random;

public class Batalha {
    // Atributos
    
    private Menu menu;
    private Random random;

    public Batalha(Criatura jogador, Criatura criaturaInimiga) {
        this.menu = new Menu();
        this.random = new Random();    
    }

    public void atacarInimigo(Criatura jogador, Criatura criaturaInimiga){
        int escolhaAtaque = menu.menuAtacarBatalha(criaturaInimiga);
        if(escolhaAtaque == 1){
            System.out.println("-------------------------------------------");
            System.out.printf("Você atacou fisicamente o %s\n",criaturaInimiga.getNome());
            jogador.atacarFisicamente(criaturaInimiga);
            System.out.printf("A vida da criatura agora é: %d",criaturaInimiga.getPontosVida());
            System.out.println("\n-------------------------------------------\n");
        }else if(escolhaAtaque == 2){
            System.out.println("-------------------------------------------");
            System.out.printf("Você atacou elementalmente o %s\n",criaturaInimiga.getNome());
            jogador.atacarElementalmente(criaturaInimiga);
            System.out.printf("A vida da criatura agora é: %d", criaturaInimiga.getPontosVida());
            System.out.println("\n-------------------------------------------\n");
        }
    }
    public void atacarJogador(Criatura jogador, Criatura criaturaInimiga){
        int escolhaAtaqueCriatura = random.nextInt(2) + 1;
        if(escolhaAtaqueCriatura == 1){
            System.out.println("-------------------------------------------");
            System.out.println("A criatura inimiga te atacou fisicamente!");
            criaturaInimiga.atacarFisicamente(jogador);
            System.out.printf("A sua vida agora é: %d",jogador.getPontosVida());
            System.out.println("\n-------------------------------------------\n");
        }else if(escolhaAtaqueCriatura == 2){
            System.out.println("-------------------------------------------");
            System.out.println("A criatura inimiga te amaldiçoou!");
            criaturaInimiga.atacarElementalmente(jogador);
            System.out.printf("Sua vida agora é: %d", jogador.getPontosVida());
            System.out.println("\n-------------------------------------------\n");
        }
    }
    public void iniciarBatalha(Criatura jogador, Criatura criaturaInimiga) {
        menu.menuMaiorVelocidade(jogador, criaturaInimiga);
        int vidaInicial = jogador.getPontosVida();

        if(jogador.getVelocidade() >= criaturaInimiga.getVelocidade()){
            System.out.println("\nVocê começa!");
            do{
                if(jogador.getPontosVida() > 0 && criaturaInimiga.getPontosVida()>0){
                    atacarInimigo(jogador, criaturaInimiga);
                    atacarJogador(jogador, criaturaInimiga);
                }
                
                //------------------------------------------------------------
                if (criaturaInimiga.getPontosVida() <= 0) {
                    System.out.println("A criatura inimiga foi derrotada!");
                    jogador.setPontosVida(vidaInicial);
                    System.out.println("Vida do jogador: " + jogador.getPontosVida());
                    break;
                }else if(jogador.getPontosVida() <= 0){
                    System.out.println("Você foi derrotado.\nSeus pontos de vida chegaram a 0.");
                    System.exit(0);
                    break;
                }
            }while (jogador.getPontosVida() > 0 || criaturaInimiga.getPontosVida() > 0);
        } else {
            System.out.println("\nA criatura inimiga começa!");
            do{
                atacarJogador(jogador, criaturaInimiga);
                atacarInimigo(jogador, criaturaInimiga);
                //------------------------------------------------------------
                if (criaturaInimiga.getPontosVida() <= 0) {
                    System.out.println("A criatura inimiga foi derrotada!");
                    jogador.setPontosVida(vidaInicial);
                    System.out.println("Vida do jogador: " + jogador.getPontosVida());
                    break;
                }else if(jogador.getPontosVida() <= 0){
                    System.out.println("Você foi derrotado.\nSeus pontos de vida chegaram a 0.");
                    System.exit(0);
                    break;
                }
            }while (jogador.getPontosVida() > 0 || criaturaInimiga.getPontosVida() > 0);
        }
    } // Fim do método iniciarBatalha
} // Fim da classe Batalha
