import java.util.ArrayList;

public class Torneio {

    private Batalha[] batalhas = new Batalha[3];
    private ArrayList<Criatura> criaturasInimigas = new ArrayList<>();
    
    //O torneio consiste de três batalhas, uma contra cada 
    //uma das criaturas não selecionadas pelo jogador.
    public Criatura definirCriatura(int criaturaEscolhida){
        if(criaturaEscolhida == 1){
            Criatura stoneDev = new StoneDev();
            return stoneDev;
        }else if(criaturaEscolhida == 2){
            Criatura waveNerd = new WaveNerd();
            return waveNerd;
        }else if(criaturaEscolhida == 3){
            Criatura burnCoder = new BurnCoder(); 
            return burnCoder;
        }else{
            Criatura breezeHacker = new BreezeHacker();
            return breezeHacker;
        }
    }

    public void separarInimigos(Criatura jogador){
        Criatura stoneDev = new StoneDev();
        Criatura waveNerd = new WaveNerd();
        Criatura burnCoder = new BurnCoder();
        Criatura breezeHacker = new BreezeHacker();

        if(!(jogador.getNome().equals(stoneDev.getNome()))){
            criaturasInimigas.add(stoneDev);
        }
        if(jogador != waveNerd){
            criaturasInimigas.add(waveNerd);
        }
        if(jogador != burnCoder){
            criaturasInimigas.add(burnCoder);
        }
        if(jogador != breezeHacker){
            criaturasInimigas.add(breezeHacker);
        }
    }
}
