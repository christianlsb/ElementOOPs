import java.util.Scanner;

public class Menu {
    // Atributos
    Scanner scanner = new Scanner(System.in);
    private boolean confirmaSaida;
    
    // Métodos
    public void confirmarSaida(boolean confirmaSaida){
        //Menu confirmação
        int menu = 1;
        while(menu != 0){
            System.out.println("Confirmar saída?");
            System.out.println("1. Sim | 2. Não");
            //Recebe a escolha
            int escolhaConfirma = scanner.nextInt();
            //Valida a solicitação de saída       
            if (escolhaConfirma == 1){
                System.out.println("Saindo do programa...");
                menu = 0;
                System.exit(0);

            }else if(escolhaConfirma == 2){
                System.out.println("Sem menu anterior.");
                menu = 0;
            }      
            else{
                System.out.println("Entrada inválida");
                System.out.println("Selecione novamente: ");
            }
        }
    }
    public void sairDoJogo(boolean saida){

        if(saida == true){
            confirmarSaida(confirmaSaida);
            if(confirmaSaida == true){
                

            }

        }


    }
//Método sair do jogo: Validação de ação
}
//Menu inicial: Iniciar o jogo | Sair do jogo
//Menu criaturas: Escolha criatura | Sair do jogo
//Menu torneio: Iniciar o torneio | Sair do jogo
//Menu batalha: Ataque fisico | Ataque elemental | Sair do jogo
//Menu vitorioso: Iniciar próxima batalha | Sair do jogo (Perder = sout(Você perdeu!))