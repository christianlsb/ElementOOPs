import java.util.Scanner;

public class MenuBatalha extends MenuInicial{

    private int numeroBatalha;

    Scanner scanner = new Scanner(System.in);

    @Override
    public void menuIniciar() {
        //Mostrar o número da batalha e qual o adversário da vez.
        if(numeroBatalha < 1){
            System.out.println("Você está batalhando pela primeira vez.");
            System.out.println("Você é páreo? Descubra!");
        } 
    }

    @Override
    public void menuConfirmarSaida() {
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
            menuBatalha();
        }      
        else{
            System.out.println("Entrada inválida!");
            System.out.println("Selecione novamente abaixo");
            menuConfirmarSaida();
        }
    }
        
    public void menuBatalha(){
        System.out.println("Como você quer atacar?");
        System.out.println("1. Ataque físico | 2. Ataque elemental | 3. Sair do jogo");  
    }
}
