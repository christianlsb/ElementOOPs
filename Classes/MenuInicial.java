import java.util.Scanner;

public class MenuInicial {
    // Atributos
    Scanner scanner = new Scanner(System.in);
    
    public void menuIniciar(){
        System.out.println("Bem vindo ao ElementOOPs!");
        System.out.println("1. Iniciar o jogo! | 2. Sair do jogo.");
        int escolhaMenuInicial = scanner.nextInt();
       
        if(escolhaMenuInicial == 1){
            System.out.println("Iniciando o jogo...");
        }else if(escolhaMenuInicial == 2){
            menuConfirmarSaida();
        }else{
            System.out.println("Escolha inválida, tente novamente: ");
            menuIniciar();
        }    
    }

    // Métodos
    public void menuConfirmarSaida(){
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
    }
}
//Método sair do jogo: Validação de ação

//Menu inicial: Iniciar o jogo | Sair do jogo
//Menu criaturas: Escolha criatura | Sair do jogo
//Menu torneio: Iniciar o torneio | Sair do jogo
//Menu batalha: Ataque fisico | Ataque elemental | Sair do jogo
//Menu vitorioso: Iniciar próxima batalha | Sair do jogo (Perder = sout(Você perdeu!))