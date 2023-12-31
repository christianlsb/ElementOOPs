public class BurnCoder extends Criatura{
    private int dano; 
    private int vidaAtual;

    public BurnCoder(){

        this.setNome("BurnCoder");
        this.setFator(new double[]{1, 1, 2});
    }
    
    // Métodos
    @Override
    public void atacarElementalmente(Criatura alvo) {
        Criatura breezeHacker = new BreezeHacker();
        Criatura stoneDev = new StoneDev();
        Criatura waveNerd = new WaveNerd();

        if(alvo.getNome().equals(stoneDev.getNome())){
            this.dano = (int) ((getPoder() * getAtaque()) / (getFator()[0] * alvo.getDefesa()));
            this.vidaAtual = alvo.getPontosVida() - dano;
            alvo.setPontosVida(vidaAtual);
            System.out.println("O fogo queima como nunca!");
            System.out.println("Dano: " + dano);
        }

         if(alvo.getNome().equals(waveNerd.getNome())){
            this.dano = (int) ((getPoder() * getAtaque()) / (getFator()[1] * alvo.getDefesa()));
            this.vidaAtual = alvo.getPontosVida() - dano;
            alvo.setPontosVida(vidaAtual);
            System.out.println("O fogo queima como nunca!");
             System.out.println("Dano: " + dano);
        }

        if(alvo.getNome().equals(breezeHacker.getNome())){
            this.dano = (int) ((getPoder() * getAtaque()) / (getFator()[2] * alvo.getDefesa()));
            this.vidaAtual = alvo.getPontosVida() - dano;
            alvo.setPontosVida(vidaAtual);
            System.out.println("O fogo queima como nunca!");
             System.out.println("Dano: " + dano);
        }
    }

    @Override
    public void atacarFisicamente(Criatura alvo){
        this.dano = getPoder() * getAtaque() / alvo.getDefesa();
        int vidaAtual = alvo.getPontosVida() - dano;
        alvo.setPontosVida(vidaAtual);
        System.out.println("Dano: " + dano);
    }
    
    // toString()
    @Override
    public String toString() {
        return "-----------------BurnCoder------------------\n" +
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
}// Fim da classe BurnCoder
