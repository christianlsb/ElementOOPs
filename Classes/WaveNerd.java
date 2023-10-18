public class WaveNerd extends Criatura {
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
