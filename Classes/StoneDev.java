public class StoneDev extends Terra {
  @Override
  public void atacarElementalmente() {
      System.out.println("StoneDev atacando elementalmente!");
  }
  @Override
  public void atacarFisicamente() {
      System.out.println("StoneDev atacando fisicamente!");
  }
  @Override
  public String toString() {
      return "StoneDev: " +
              "poder=" + getPoder() + ", ataque=" + getAtaque() +
              ", defesa=" + getDefesa() + ", velocidade=" + getVelocidade() +
              ", pontosVida=" + getPontosVida();
  }
}
