public class WaveNerd extends Agua {
  @Override
  public void atacarElementalmente(){};
  @Override
  public void atacarFisicamente(){};

  @Override
  public String toString() {
      return "WaveNerd: " +
              "poder=" + getPoder() + ", ataque=" + getAtaque() +
              ", defesa=" + getDefesa() + ", velocidade=" + getVelocidade() +
              ", pontosVida=" + getPontosVida();
  }
}
