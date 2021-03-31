import java.util.Scanner;

public class Escolha {
    public void EscolhaMonstro() {

        Scanner leitura = new Scanner(System.in);
        int escolhaJogadorUm;
        int controleEscolhaJogadorUm = 1;
        int[] monstro = new int[3];
        int acmErro = 0;

        for(int i = 0; i < controleEscolhaJogadorUm; i++) {
            do{

                System.out.println(" ");
                System.out.println("Atenção jogador, escolha pelo ID:");
                System.out.println("Faça sua " + controleEscolhaJogadorUm + "ª escolha de monstro para a batalha\n");
                System.out.printf("Escolha: ");

                do{
                    escolhaJogadorUm = leitura.nextInt();
                    monstro[controleEscolhaJogadorUm] = escolhaJogadorUm;

                    if(escolhaJogadorUm < 1 || escolhaJogadorUm > 6){
                        System.out.println("\nMonstro não encontrado, escolha novamente!\n");
                        System.out.println("Faça sua " + controleEscolhaJogadorUm + "ª escolha de algum monstro acima\n");
                        System.out.printf("Escolha: ");
                        escolhaJogadorUm = 0;
                    }

                    if(monstro[i] == escolhaJogadorUm){
                        System.out.println("Monstro já escolhido. Escolha outro monstro, jogador!");
                        System.out.println("Faça sua " + controleEscolhaJogadorUm + "ª escolha de algum monstro acima\n");
                        System.out.printf("Escolha: ");
                        escolhaJogadorUm = 0;
                        acmErro++;
                    }

                }while(escolhaJogadorUm < 1 || escolhaJogadorUm > 6);
                
                controleEscolhaJogadorUm++;
                escolhaJogadorUm++;
                monstro[i]++;

            } while (controleEscolhaJogadorUm <= 3 );
        }
    }
}