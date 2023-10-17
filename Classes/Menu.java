import java.util.Scanner;

public class Menu {
    // Atributos
    private int numeroBatalha;
    private Scanner scanner;

    public Menu(){
        this.scanner = new Scanner(System.in);
    }
    
    // Métodos
    public void menuIniciar(){
        System.out.println("Bem vindo ao ElementOOPs!");
        System.out.println("1. Iniciar o jogo! | 2. Sair do jogo.");
        int escolhaMenuInicial = scanner.nextInt();
       
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
        int escolhaCriatura = scanner.nextInt();

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
        scanner = new Scanner(System.in);
        System.out.println("Torneio!");
        System.out.println("1. Iniciar torneio! | 2. Sair do jogo.");
        int escolhaMenuTorneio = scanner.nextInt();

        if(escolhaMenuTorneio == 1){
            System.out.println("Iniciando torneio...");
        }else if(escolhaMenuTorneio == 2){
            menuConfirmarSaida();
        }else{
            System.out.println("Escolha inválida, tente novamente: ");
            menuIniciarTorneio();
        }
        scanner.close();
    }

    public int menuAtacarBatalha() {
        //Mostrar o número da batalha e qual o adversário da vez.
        scanner = new Scanner(System.in);
        if(numeroBatalha < 1){
            System.out.println("Você está batalhando pela primeira vez.");
            System.out.println("Você é páreo? Descubra!");
        } 
        System.out.println("Como você quer atacar?");
        System.out.println("1. Ataque físico | 2. Ataque elemental | 3. Sair do jogo"); 
        int escolhaAtaque = scanner.nextInt();

        if(escolhaAtaque == 3){
            menuConfirmarSaida();
        //Else if: Se for diferente do intervalo entre 1 e 3:
        }else if(!(escolhaAtaque>=1 & escolhaAtaque<=3)){
            System.out.println("Escolha inválida, tente novamente: ");
            menuAtacarBatalha();
        }
        scanner.close();
        return escolhaAtaque;
    }

    public void menuConfirmarSaida(){
        scanner = new Scanner(System.in);
        System.out.println("Confirmar saída?");
        System.out.println("1. Sim | 2. Não");
        int escolhaConfirma = scanner.nextInt();
 
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
        scanner.close();
    }

    public void menuMaiorVelocidade(Criatura jogador, Criatura computador){
        System.out.println("O jogador com maior velocidade começa!");
        System.out.printf("Sua velocidade: %d\n", jogador.getVelocidade());
        System.out.printf("Velocidade do seu oponente: %d\n",computador.getVelocidade());
    }
}
//Método sair do jogo: Validação de ação
//Menu inicial: Iniciar o jogo | Sair do jogo - ok
//Menu criaturas: Escolha criatura | Sair do  - ok 
//Menu torneio: Iniciar o torneio | Sair do jogo - ok
//Menu batalha: Ataque fisico | Ataque elemental | Sair do jogo - ok
//Menu vitorioso: Iniciar próxima batalha | Sair do jogo (Perder = sout(Você perdeu!))