import java.util.Scanner;

public class Escolha {
    public void EscolhaMonstro() {

        Scanner leitura = new Scanner(System.in);
        int escolhaJogadorUm[] = new int[3];
        int controleEscolhaJogadorUm = 1;

        for(int percorreVetor = 0; percorreVetor < 1; percorreVetor++){
            do{

                System.out.println(" ");
                System.out.println("Atenção jogar, pelo ID:");
                System.out.println("Faça sua " + controleEscolhaJogadorUm + "ª escolha de monstro para a batalha\n");
                System.out.printf("Escolha: ");

                do{
                    escolhaJogadorUm[percorreVetor] = leitura.nextInt();

                    if(escolhaJogadorUm[percorreVetor] < 1 || escolhaJogadorUm[percorreVetor] > 6){
                        System.out.println("\nMonstro não encontrado, escolha novamente!\n");
                        System.out.println("Faça sua " + controleEscolhaJogadorUm + "ª escolha de algum monstro acima\n");
                        System.out.printf("Escolha: ");
                        escolhaJogadorUm[percorreVetor] = 0;
                    }


                }while(escolhaJogadorUm[percorreVetor] < 1 || escolhaJogadorUm[percorreVetor] > 6);
                
                controleEscolhaJogadorUm++;
                escolhaJogadorUm[percorreVetor] = percorreVetor * 3;

            } while (controleEscolhaJogadorUm <= 3 );
        }
    }
}