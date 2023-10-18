public class BreezeHacker extends Ar{

    //
    // Métodos
    @Override
    public void atacarElementalmente() {
        System.out.println("BreezeHacker atacando elementalmente!");
    }
    @Override
    public void atacarFisicamente() {
        System.out.println("BreezeHacker atacando fisicamente!");
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
