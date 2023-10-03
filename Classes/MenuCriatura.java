import java.util.Scanner;

public class MenuCriatura extends MenuInicial {
    
    private String elemento;

    public void menuIniciar() {
        System.out.println("Bem vindo ao jogo de batalha de criaturas!");
        System.out.println("1. Iniciar | 2. Sair");
        Scanner scanner = new Scanner(System.in);
        int escolhaMenu = scanner.nextInt();
        if (escolhaMenu == 1) {
            escolherCriatura();
        } else if (escolhaMenu == 2) {
            menuConfirmarSaida();
        } else {
            System.out.println("Entrada inválida!");
            System.out.println("Selecione novamente abaixo");
            menuIniciar();
        }
        scanner.close();
    }
    
    public void escolherCriatura() {
        Criatura criatura = new Criatura();
        
        System.out.println("Escolha sua criatura: ");
        System.out.println("1. StoneDev (terra) | 2. WaveNerd (água) | 3. BurnCoder (fogo) | 4. BreezeHacker (ar)");
        Scanner scanner = new Scanner(System.in);
        int escolhaCriatura = scanner.nextInt();

        if (escolhaCriatura == 1) {
            System.out.println("Você escolheu StoneDev!");
        } else if (escolhaCriatura == 2) {
            System.out.println("Você escolheu WaveNerd!");
        } else if (escolhaCriatura == 3) {
            System.out.println("Você escolheu BurnCoder!");
        } else if (escolhaCriatura == 4) {
            System.out.println("Você escolheu BreezeHacker!");
        } else {
            System.out.println("Escolha inválida, tente novamente: ");
            escolherCriatura();
        }
        scanner.close();
    }

    @Override
    public void menuConfirmarSaida() {
        System.out.println("Confirmar saída?");
        System.out.println("1. Sim | 2. Não");
        Scanner scanner = new Scanner(System.in);
        int escolhaConfirma = scanner.nextInt();
        if (escolhaConfirma == 1) {
            System.out.println("Saindo do programa...");
            System.exit(0);
        } else if (escolhaConfirma == 2) {
            menuIniciar();
        } else {
            System.out.println("Entrada inválida!");
            System.out.println("Selecione novamente abaixo");
            menuConfirmarSaida();
        }
        scanner.close();
    }
}

