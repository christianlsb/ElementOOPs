public class StoneDev extends Criatura {
        private int dano; 
        private int vidaAtual;
    public StoneDev() {
        this.setNome("StoneDev");
        this.setFator(new double[]{1, 1, 2});
    }

  @Override
    public void atacarElementalmente(Criatura alvo) {
        Criatura burnCoder = new BurnCoder();
        Criatura breezeHacker = new BreezeHacker();
        Criatura waveNerd = new WaveNerd();

        if(alvo.getNome().equals(breezeHacker.getNome())){
            this.dano = (int) ((getPoder() * getAtaque()) / (getFator()[1] * alvo.getDefesa()));
            this.vidaAtual = alvo.getPontosVida() - dano;
            alvo.setPontosVida(vidaAtual);
            System.out.println("Nada pode me deter quando as pedras são meu escudo e minha espada!");
            System.out.println("Dano: " + dano);
        }

         if(alvo.getNome().equals(waveNerd.getNome())){
            this.dano = (int) ((getPoder() * getAtaque()) / (getFator()[2] * alvo.getDefesa()));
            this.vidaAtual = alvo.getPontosVida() - dano;
            alvo.setPontosVida(vidaAtual);
            System.out.println("Nada pode me deter quando as pedras são meu escudo e minha espada!");
            System.out.println("Dano: " + dano);
        }

        if(alvo.getNome().equals(burnCoder.getNome())){
            this.dano = (int) ((getPoder() * getAtaque()) / (getFator()[0] * alvo.getDefesa()));
            this.vidaAtual = alvo.getPontosVida() - dano;
            alvo.setPontosVida(vidaAtual);
            System.out.println("Nada pode me deter quando as pedras são meu escudo e minha espada!");
            System.out.println("Dano: " + dano);
        }
      
      }


  @Override
  public void atacarFisicamente(Criatura alvo){
    int dano = getPoder() * getAtaque() / alvo.getDefesa();
    int vidaAtual = alvo.getPontosVida() - dano;
    alvo.setPontosVida(vidaAtual);
    System.out.println("Dano: " + dano);
  }
  @Override
  public String toString() {
    return "-----------------StoneDev------------------\n" +
    "|Poder: " + getPoder() + "|\n" +
    "-------------------------------------------\n" +
    "|Ataque: " + getAtaque() + "|\n" +
    "-------------------------------------------\n" +
    "|Defesa: " + getDefesa() + "|\n" + 
    "-------------------------------------------\n" +
    "|Velocidade: " + getVelocidade() + "|\n" + 
    "-------------------------------------------\n" +
    "|Pontos de Vida: " + getPontosVida() + "|\n" + 
    "-------------------------------------------\n";
  }
} // Fim da classe StoneDev

