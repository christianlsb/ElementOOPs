public class BurnCoder extends Fogo{
    // Métodos
    @Override
    public void atacarElementalmente() {

    }
    // toString()
    @Override
    public String toString() {
        return "BurnCoder: " +
                "poder=" + getPoder() + ", ataque=" + getAtaque() +
                ", defesa=" + getDefesa() + ", velocidade=" + getVelocidade() +
                ", pontosVida=" + getPontosVida();
    }
}// Fim da classe BurnCoder
