import java.util.Random;

public class Criatura extends Elemento {

    private int poder;
    private int ataque;
    private int defesa;
    private int velocidade;
    private int pontosVida;
    
    Random random = new Random();

    public Criatura(){
        this.poder = random.nextInt(21) + 10;
        this.ataque = random.nextInt(11) + 5;
        this.defesa = random.nextInt(11) + 5;
        this.velocidade = random.nextInt(10) + 1;
        this.pontosVida = random.nextInt(201) + 200;
    }

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

    public int getPontosVida() {
        return this.pontosVida;
    }

    @Override
    public String toString() {
        return "A sua criatura é: " + 
        ", poder=" + getPoder() + ", ataque=" + getAtaque() +
        ", defesa=" + getDefesa() + ", velocidade=" + getVelocidade() + 
        ", pontosVida=" + getPontosVida() +"]";
    }

}
