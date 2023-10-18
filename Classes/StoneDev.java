public class StoneDev extends Criatura {
    public StoneDev(String nome, int poder, int ataque, int defesa, int velocidade, int pontosVida){
        super(String nome, poder,  ataque,  defesa,  velocidade,  pontosVida);

        setNome("StoneDev");
    }
  @Override
  public void atacarElementalmente() {
      System.out.println("StoneDev atacando elementalmente!");
  }
  @Override
  public void atacarFisicamente(Criatura alvo){
    int dano = this.poder * this.ataque / alvo.getDefesa();
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
