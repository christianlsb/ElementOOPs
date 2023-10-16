import java.util.Random;

public class Batalha {
    // Atributos
    private Criatura jogador;
    private Criatura computador;
    private Menu menu;
    private int turno;
    private int numJogador;
    private int numComputador;
    private Random random;

    public Batalha(Criatura jogador, Criatura computador) {
        this.menu = new Menu();
        this.random = new Random();
        this.jogador = jogador;
        this.computador = computador;
        this.turno = 0;
        this.numComputador = random.nextInt();
        this.numJogador = random.nextInt();
    }
    public Criatura maiorVelocidade(){
        int velJogador = jogador.getVelocidade();
        int velComputador = computador.getVelocidade();
        //Se o jogador tiver maior velocidade, ele começa.
        if(velJogador > velComputador){
            return jogador;
        //Se o computador tiver maior velocidade, ele começa.
        }else if(velJogador < velComputador){
            return computador;
        }else{//Bloco de desempate de velocidade.
            System.out.println("Velocidade empatada, sorteando...");
            do{
                if(numComputador>numJogador){
                    System.out.println("O oponente começa!");
                    return computador;
                }else{
                    System.out.println("Você começa!");
                    return jogador;
                }
            }while(numComputador == numJogador);
        }
    }
    public Criatura menorVelocidade(){
        int velJogador = jogador.getVelocidade();
        int velComputador = computador.getVelocidade();
        //Se o jogador tiver maior velocidade, ele começa.
        if(velJogador < velComputador){
            return jogador;
            //Se o computador tiver maior velocidade, ele começa.
        }else if(velJogador > velComputador){
            return computador;
        }else{//Bloco de desempate de velocidade.
            System.out.println("Velocidade empatada, sorteando...");
            do{
                if(numComputador>numJogador){
                    System.out.println("O oponente começa!");
                    return computador;
                }else{
                    System.out.println("Você começa!");
                    return jogador;
                }
            }while(numComputador == numJogador);
        }
    }

    public void trocarTurno() {
        this.turno += 1;
    }

    public void iniciarBatalha() {
        Criatura primeiro = maiorVelocidade();
        Criatura segundo = menorVelocidade();
        System.out.printf("Velocidade do jogador: %d\n", jogador.getVelocidade());
        System.out.printf("Velocidade do oponente: %d\n",computador.getVelocidade());
        System.out.println("Combatente " + primeiro + " começa atacando!");
        do {
            if (computador.getPontosVida() <= 0) {
                System.out.println("O computador foi derrotado!");
                break;
            }else if(jogador.getPontosVida() <= 0){
                System.out.println("Seus pontos chegaram a 0.");
                break;
            }
        } while (jogador.getPontosVida() > 0 || computador.getPontosVida() > 0);
    } // Fim do método iniciarBatalha
} // Fim da classe Batalha
