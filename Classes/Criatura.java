import java.util.Random;

public abstract class Criatura {
    // Atributos
    private int poder;
    private int ataque;
    private int defesa;
    private int velocidade;
    private int pontosVida;
    private String nome;
    private double[] fator;
    Random random = new Random();
    // Construtor
    public Criatura(){
        this.poder = random.nextInt(21) + 10;
        this.ataque = random.nextInt(11) + 5;
        this.defesa = random.nextInt(11) + 5;
        this.velocidade = random.nextInt(10) + 1;
        this.pontosVida = random.nextInt(99) + 100;
        this.fator = new double[3];
        this.nome = "Não definida";
    }
    // GETTER'S & SETTER'S
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
    public void setPontosVida(int pontosVida) {
        this.pontosVida = pontosVida;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double[] getFator() {
        return this.fator;
    }

    public void setFator(double[] fator) {
        this.fator = fator;
    }
    // Métodos
    public abstract void atacarFisicamente(Criatura alvo);
    public abstract void atacarElementalmente(Criatura alvo);
    @Override
    public String toString() {
        return getNome() +
                "poder=" + getPoder() + ", ataque=" + getAtaque() +
                ", defesa=" + getDefesa() + ", velocidade=" + getVelocidade() +
                ", pontosVida=" + getPontosVida();
    }
}
