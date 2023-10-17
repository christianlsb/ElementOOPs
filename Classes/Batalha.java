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

    public void trocarTurno() {
        this.turno += 1;
    }

    public void iniciarBatalha() {
        menu.menuMaiorVelocidade(jogador, computador);

        Criatura primeiroJogador;
        Criatura segundoJogador;

        if(jogador.getVelocidade() >= computador.getVelocidade()){
            System.out.println("Você começa!");
            primeiroJogador = jogador;
            segundoJogador = computador;
        }else{
            primeiroJogador = computador;
            segundoJogador = jogador;
        }
        
        
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
