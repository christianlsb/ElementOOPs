public class StoneDev extends Criatura {

    Menu menu;

    public StoneDev() {
        this.setNome("StoneDev");
        this.menu = new Menu();
    }

  @Override
  public void atacarElementalmente(Criatura alvo) {
      System.out.println("Nada pode me deter quando as pedras são meu escudo e minha espada!");
  }
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
