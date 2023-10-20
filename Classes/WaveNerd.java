public class WaveNerd extends Criatura {

  public WaveNerd() {
    this.setNome("WaveNerd");
  }

  @Override
  public void atacarElementalmente(Criatura alvo){
    System.out.println("Estas águas são traiçoeiras!");
  };
  @Override
  public void atacarFisicamente(Criatura alvo){
    int dano = getPoder() * getAtaque() / alvo.getDefesa();
    int vidaAtual = alvo.getPontosVida() - dano;
    alvo.setPontosVida(vidaAtual);
}
  @Override
  public String toString() {
      return getNome() +
              "poder=" + getPoder() + ", ataque=" + getAtaque() +
              ", defesa=" + getDefesa() + ", velocidade=" + getVelocidade() +
              ", pontosVida=" + getPontosVida();
  }
}
