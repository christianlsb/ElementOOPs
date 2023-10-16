public class BreezeHacker extends Ar{
    private String nome;
    //
    // Métodos
    @Override
    public void atacarElementalmente() {

    }
    // toString()
    @Override
    public String toString() {
        return "BreezeHacker: " +
                "poder=" + getPoder() + ", ataque=" + getAtaque() +
                ", defesa=" + getDefesa() + ", velocidade=" + getVelocidade() +
                ", pontosVida=" + getPontosVida();
    }
} // Fim da classe BreezeHacker
