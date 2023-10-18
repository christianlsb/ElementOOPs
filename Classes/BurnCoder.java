public class BurnCoder extends Criatura{

    public BurnCoder() {
        this.setNome("BurnCoder");
    }
    
    // Métodos
    @Override
    public void atacarElementalmente() {
        System.out.println("BurnCoder atacando elementalmente!");
    }
    @Override
    public void atacarFisicamente(Criatura alvo){
    int dano = getPoder() * getAtaque() / alvo.getDefesa();
    int vidaAtual = alvo.getPontosVida() - dano;
    alvo.setPontosVida(vidaAtual);
}
    
    // toString()
    @Override
    public String toString() {
        return getNome() +
                "poder=" + getPoder() + ", ataque=" + getAtaque() +
                ", defesa=" + getDefesa() + ", velocidade=" + getVelocidade() +
                ", pontosVida=" + getPontosVida();
    }
}// Fim da classe BurnCoder
