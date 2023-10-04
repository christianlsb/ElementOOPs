import java.util.Scanner;

public class MenuCriatura {
    
    private String elemento;

    public void menuA() {
        System.out.println("Bem vindo ao jogo de batalha de criaturas!");
        System.out.println("1. Iniciar | 2. Sair");
        Scanner scanner = new Scanner(System.in);
        int escolhaMenu = scanner.nextInt();
        if (escolhaMenu == 1) {
            escolherCriatura();
        } else if (escolhaMenu == 2) {
            System.out.println();
        } else {
            System.out.println("Entrada inválida!");
            System.out.println("Selecione novamente abaixo");
            menuA();
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
}



