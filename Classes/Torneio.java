import java.util.ArrayList;

public class Torneio {

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

    public ArrayList<Criatura> separarInimigos(Criatura jogador){
        Criatura burnCoder = new BurnCoder();
        Criatura breezeHacker = new BreezeHacker();
        Criatura stoneDev = new StoneDev();
        Criatura waveNerd = new WaveNerd();

        if(!(jogador.getNome().equals(burnCoder.getNome()))){
            criaturasInimigas.add(burnCoder);
        }
        if(!(jogador.getNome().equals(breezeHacker.getNome()))){
            criaturasInimigas.add(breezeHacker);
        }
        if(!(jogador.getNome().equals(stoneDev.getNome()))){
            criaturasInimigas.add(stoneDev);
        }
        if(!(jogador.getNome().equals(waveNerd.getNome()))){
            criaturasInimigas.add(waveNerd);
        }
        return criaturasInimigas;
    }
}
