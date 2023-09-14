// Importando Random
import java.util.Random;

public class Criatura {
    // Atributos
    private int poder;
    private int ataque;
    private int defesa;
    private int velocidade;
    private int pontos_vida;

    // Construtor
    public Criatura (){
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
                "poder=" + getPoder() +
                ", ataque=" + getAtaque() +
                ", defesa=" + getDefesa() +
                ", velocidade=" + getVelocidade() +
                ", pontos_vida=" + getPontos_vida() +
                '}';
    }
} // Fim da classe Criatura
