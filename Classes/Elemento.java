public class Elemento{
    // Atributos
    private final String[] personagens = {"StoneDev","WaveNerd","BurnCoder","BreezeHacker"};
    private String personagem_escolhido;
    private static int count;

    // Construtor
    public Elemento() {
        setPersonagem_escolhido();
        count++;
        if (count >= personagens.length){
            count = 0;
        }
    }

    // Getter's & Setter's
    public String getPersonagem_escolhido() {
        return this.personagem_escolhido;
    }
    public void setPersonagem_escolhido() {
        this.personagem_escolhido = personagens[count];
    }


    // to String
    @Override
    public String toString() {
        return "Elemento{" +
                "personagem_escolhido='" + this.personagem_escolhido + '\'' +
                '}';
    }
}
