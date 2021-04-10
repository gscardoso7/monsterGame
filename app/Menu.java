import java.util.Scanner;

public class Menu {
    public int menuInteracao(){
        System.out.println("\t>>> Monster Game <<<");

        System.out.println("\t1- Jogar partida arcade");
        System.out.println("\t2- Sair");
        System.out.printf("RESPOSTA: ");

        Scanner leitura = new Scanner(System.in);
        
        int navegacaoMenu = 0;

        navegacaoMenu = leitura.nextInt();

        switch (navegacaoMenu) {

            case 1:
                System.out.println("");
                break;

            case 2: 
                
                break;

            default:
                System.out.println("Opcao não encontrada!");
                break;

        }

        return navegacaoMenu;
    }
}
