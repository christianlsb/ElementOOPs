public class StoneDev extends Criatura {
  
  @Override
  public void atacarFisicamente() {
    int danoTotal = getAtaque() + getPoder();
    System.out.println("StoneDev atacou fisicamente com " + danoTotal + " de dano");
  }
}
