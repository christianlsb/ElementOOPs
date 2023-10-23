import java.util.Scanner;

public class Menu {
    // Atributos
    private Scanner scanner;

    public Menu(){
        this.scanner = new Scanner(System.in);
    }
    
    // Métodos
    public void menuIniciar(){

        System.out.println("Bem vindo ao ElementOOPs!");
        System.out.println("1. Iniciar o jogo! | 2. Sair do jogo.");
        System.out.print("Sua escolha: ");
        int escolhaMenuInicial = scanner.nextInt();
        System.out.println("\n");
       
        if(escolhaMenuInicial == 2){
            menuConfirmarSaida();
        //Else if: Se for diferente do intervalo entre 1 e 2:
        }else if(!(escolhaMenuInicial>=1 & escolhaMenuInicial<=2)){
            System.out.println("Escolha inválida, tente novamente: ");
            menuIniciar();
        }    
    }

    public int menuEscolherCriatura() {

        System.out.println("Escolha sua criatura: ");
        System.out.println("1. StoneDev (terra) | 2. WaveNerd (água) | 3. BurnCoder (fogo) | 4. BreezeHacker (ar) | 5. Sair do jogo");
        System.out.print("Sua escolha: ");
        int escolhaCriatura = scanner.nextInt();
        System.out.println("\n");

        if (escolhaCriatura == 1) {
            System.out.println("Você escolheu StoneDev!");
        } else if (escolhaCriatura == 2) {
            System.out.println("Você escolheu WaveNerd!");
        } else if (escolhaCriatura == 3) {
            System.out.println("Você escolheu BurnCoder!");
        } else if (escolhaCriatura == 4) {
            System.out.println("Você escolheu BreezeHacker!");
        } else if (escolhaCriatura == 5){
            menuConfirmarSaida();    
        } else {
            System.out.println("Escolha inválida, tente novamente: ");
            menuEscolherCriatura();
        }
        return escolhaCriatura;
    }
    public void menuIniciarTorneio(){ 

        System.out.println("Torneio!");
        System.out.println("1. Iniciar torneio! | 2. Sair do jogo.");
        System.out.print("Sua escolha: ");
        int escolhaMenuTorneio = scanner.nextInt();
        System.out.println("\n");

        if(escolhaMenuTorneio == 1){
            System.out.println("Iniciando torneio...\n");
        }else if(escolhaMenuTorneio == 2){
            menuConfirmarSaida();
        }else{
            System.out.println("Escolha inválida, tente novamente: ");
            menuIniciarTorneio();
        }
    }
    public void menuConfirmarBatalha(){

        System.out.println("Você deseja ir à próxima arena?");
        System.out.println("1. Sim! | 2. Sair do jogo.");
        System.out.print("Sua escolha: ");
        int proximaBatalha = scanner.nextInt();
        System.out.println("\n");

        if(proximaBatalha == 1){
            System.out.println("Cavalgando para a arena...\n");
            ;
        }
        else if(proximaBatalha == 2){
            menuConfirmarSaida();
        }else{
            menuConfirmarBatalha();
        }
    }
    public void menuBatalhar(int turno, Criatura criaturaInimiga){

        if(turno == 1){
            System.out.println("Ora ora, vejo que você é novo por aqui...");
            System.out.println("Você é pareo?\n");
            System.out.println("Você irá enfrentar o grande: ");
            System.out.println(criaturaInimiga);
        }else if(turno == 2) {
            System.out.println("Hum, então você ganhou a primeira batalha?");
            System.out.println("Sobreviva, se for capaz ao... MUAHAHAHA");
            System.out.println(criaturaInimiga);
        }else{
            System.out.println("Você chegou na arena final!"); 
            System.out.println("Você nunca me derrotará. NUNCA!");
            System.out.println(criaturaInimiga);
        }
    }
    public int menuAtacarBatalha(Criatura jogador) {
        
        System.out.printf("Seu poder: %d | Seu ataque: %d\n", jogador.getPoder(), jogador.getAtaque());
        

        System.out.println("Como você quer atacar?");
        System.out.println("1. Ataque físico | 2. Ataque elemental | 3. Sair do jogo");
        System.out.print("Sua escolha: ");
        int escolhaAtaque = scanner.nextInt();
        System.out.println("\n");

        if(escolhaAtaque == 3){
            menuConfirmarSaida();
        //Else if: Se for diferente do intervalo entre 1 e 3:
        }else if(!(escolhaAtaque>=1 & escolhaAtaque<=3)){
            System.out.println("Escolha inválida, tente novamente: ");
            menuAtacarBatalha(jogador);
        }   
        return escolhaAtaque;
    }
    public void menuConfirmarSaida(){
        
        System.out.println("Confirmar saída?");
        System.out.println("1. Sim | 2. Não");
        System.out.print("Sua escolha: ");
        int escolhaConfirma = scanner.nextInt();
        System.out.println("\n");
 
        //Valida a solicitação de saída       
        if (escolhaConfirma == 1){
            System.out.println("Saindo do programa...");
            System.exit(0);

        }else if(escolhaConfirma == 2){
            /*Confirmar saída do menu inicial, 
            sem menu anterior. Alterar pro menu anterior
            de acordo com o uso do método.*/
            menuIniciar();
        }      
        else{
            System.out.println("Entrada inválida!");
            System.out.println("Selecione novamente abaixo");
            menuConfirmarSaida();
        }
    }
    public void menuMaiorVelocidade(Criatura jogador, Criatura computador){
        System.out.println("O jogador com maior velocidade começa!");
        System.out.printf("-> Sua velocidade: %d\n", jogador.getVelocidade());
        System.out.printf("-> Velocidade do seu oponente: %d\n",computador.getVelocidade());
    }
}
