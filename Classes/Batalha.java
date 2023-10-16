import java.util.Random;

public class Batalha {

    private Criatura jogador;
    private Criatura computador;
    private Menu menu;
    private int turno;
    private Random random;
    private int numJogador;
    private int numComputador;

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
        System.out.println("O jogador com maior velocidade começa!");
        System.out.printf("Sua velocidade: %d\n", jogador.getVelocidade());
        System.out.printf("Velocidade do seu oponente: %d\n",computador.getVelocidade());
        
        //Se o jogador tiver maior velocidade, ele começa.
        if(jogador.getVelocidade()>computador.getVelocidade()){
            System.out.println("--------------");
            System.out.println("Você começa!");
            return jogador;
        //Se o computador tiver maior velocidade, ele começa.
        }else if(jogador.getVelocidade()<computador.getVelocidade()){
            System.out.println("--------------");
            System.out.println("O oponente começa!");
            return computador;
        }else{
            //Bloco de desempate de velocidade.
            System.out.println("--------------");
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
       
        
        do {

            if (computador.getPontosVida() <= 0) {
                System.out.println("O computador foi derrotado!");
                break;
            }else if(jogador.getPontosVida() <= 0){
                System.out.println("Seus pontos chegaram a 0.");
                break;
            }
        } while (jogador.getPontosVida() > 0 || computador.getPontosVida() > 0);

    }
}
