public class BreezeHacker extends Criatura{
    public BreezeHacker() {
        this.setNome("BreezeHacker");
    }
    
    // Métodos
    @Override
    public void atacarElementalmente() {
        System.out.println("BreezeHacker atacando elementalmente!");
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
    //sobrescrever o equals em cada subclasse.
} // Fim da classe BreezeHacker
