import java.util.Scanner;

public class Escolha {
    public void EscolhaMonstro() {

        int escolhaJogadorUm = 0;   
        int controleEscolhaJogadorUm = 1;
        int[] monstro = new int[3];

        Scanner leitura = new Scanner(System.in);

        do {

            System.out.println("Faça sua " + controleEscolhaJogadorUm +"ª escolha");
            System.out.printf("RESPOSTA: ");
            escolhaJogadorUm = leitura.nextInt();

            switch (escolhaJogadorUm) {
                case 1:
                    System.out.println("Beholder");
                    break;

                case 2:
                    System.out.println("Mimico");
                    break;
                
                case 3:
                    System.out.println("Lich");
                    break;
                
                case 4:
                    System.out.println("Drow");
                    break;

                case 5:
                    System.out.println("Tarrasque");
                    break;

                case 6:
                    System.out.println("Female");
                    break;

                default:
                    do {
                        System.out.println("Opção não encontrada, digite novamente");
                        System.out.println("RESPOSTA: ");

                        escolhaJogadorUm = leitura.nextInt();

                        System.out.println("\n");

                    } while (escolhaJogadorUm < 1 || escolhaJogadorUm > 6);

                    break;
            }

            controleEscolhaJogadorUm++;

        } while (controleEscolhaJogadorUm <= 3);
    }
}