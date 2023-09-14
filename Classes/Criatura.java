// Importando Random
import java.util.Random;

public class Criatura extends Elemento {
    // Atributos
    private final int poder;
    private final int ataque;
    private final int defesa;
    private final int velocidade;
    private final int pontos_vida;

    // Construtor
    public Criatura (){
        super();
        Random random = new Random();
        this.poder = random.nextInt(10,30);
        this.ataque = random.nextInt(5,15);
        this.defesa = random.nextInt(5,15);
        this.velocidade = random.nextInt(1,10);
        this.pontos_vida = random.nextInt(200,400);
    }
    // Métodos
    public int getPoder() {
        return this.poder;
    }
    public int getAtaque() {
        return this.ataque;
    }
    public int getDefesa() {
        return this.defesa;
    }
    public int getVelocidade() {
        return this.velocidade;
    }
    public int getPontos_vida() {
        return this.pontos_vida;
    }
    // toString()
    @Override
    public String toString() {
        return "Criatura{" +
                "personagem_escolhido='" + getPersonagem_escolhido() + '\'' +
                "poder=" + getPoder() +
                ", ataque=" + getAtaque() +
                ", defesa=" + getDefesa() +
                ", velocidade=" + getVelocidade() +
                ", pontos_vida=" + getPontos_vida() +
                '}';
    }
} // Fim da classe Criatura
