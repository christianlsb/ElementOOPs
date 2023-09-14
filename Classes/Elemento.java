// Importando Random
import java.util.Random;

public class Elemento extends Criatura{
    // Atributos
    private final String[] personagens = {"StoneDev","WaveNerd","BurnCoder","BreezeHacker"};
    private String personagem_escolhido;
    private double fator;

    // Construtor
    public Elemento(double fator) {
        Random random = new Random();
        this.personagem_escolhido = personagens[random.nextInt(0,3)];
        this.fator = fator;
    }

    // Getter's & Setter's

    // to String
    @Override
    public String toString() {
        return "Elemento{" +
                "personagem_escolhido='" + this.personagem_escolhido + '\'' +
                ", fator=" +this.fator +
                ", poder=" + getPoder() +
                ", ataque=" + getAtaque() +
                ", defesa=" + getDefesa() +
                ", velocidade=" + getVelocidade() +
                ", pontos_vida=" + getPontos_vida() +
                '}';
    }
}
