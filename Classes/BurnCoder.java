public class BurnCoder extends Criatura{
    // Métodos
    @Override
    public void atacarElementalmente() {
        System.out.println("BurnCoder atacando elementalmente!");
    }
    @Override
    public void atacarFisicamente() {
        System.out.println("BurnCoder atacando fisicamente!");
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
