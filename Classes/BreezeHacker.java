public class BreezeHacker extends Criatura{
        private int dano; 
        private int vidaAtual;
        
        public BreezeHacker() {
        this.setFator(new double[]{1, 1, 2});
        this.setNome("BreezeHacker");
    }
    
    @Override
    public void atacarElementalmente(Criatura alvo) {
        Criatura burnCoder = new BurnCoder();
        Criatura stoneDev = new StoneDev();
        Criatura waveNerd = new WaveNerd();

        if(alvo.getNome().equals(stoneDev.getNome())){
            this.dano = (int) ((getPoder() * getAtaque()) / (getFator()[2] * alvo.getDefesa()));
            this.vidaAtual = alvo.getPontosVida() - dano;
            alvo.setPontosVida(vidaAtual);
            System.out.println("O ar é meu aliado, e você é minha presa");
            System.out.println("Dano: " + dano);
        }

         if(alvo.getNome().equals(waveNerd.getNome())){
            this.dano = (int) ((getPoder() * getAtaque()) / (getFator()[1] * alvo.getDefesa()));
            this.vidaAtual = alvo.getPontosVida() - dano;
            alvo.setPontosVida(vidaAtual);
            System.out.println("O ar é meu aliado, e você é minha presa");
            System.out.println("Dano: " + dano);
        }

        if(alvo.getNome().equals(burnCoder.getNome())){
            this.dano = (int) ((getPoder() * getAtaque()) / (getFator()[0] * alvo.getDefesa()));
            this.vidaAtual = alvo.getPontosVida() - dano;
            alvo.setPontosVida(vidaAtual);
            System.out.println("O ar é meu aliado, e você é minha presa");
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
    // toString()
    @Override
    public String toString() {
        return "-----------------BreezeHacker------------------\n" +
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
    //sobrescrever o equals em cada subclasse.
} // Fim da classe BreezeHacker
