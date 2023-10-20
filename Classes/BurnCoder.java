public class BurnCoder extends Criatura{

    public BurnCoder() {
        this.setNome("BurnCoder");
    }
    
    // Métodos
    @Override
    public void atacarElementalmente(Criatura alvo) {
        System.out.println("Você tem ideia do quão quente é o bafo de fogo?");
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
