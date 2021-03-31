import java.util.Scanner;

public class Escolha {
    public void EscolhaMonstro() {

        Scanner leitura = new Scanner(System.in);
        int escolhaJogadorUm = 0;
        int controleEscolhaJogadorUm = 1;
        
        do{

            System.out.println(" ");
            System.out.println("Faça sua " + controleEscolhaJogadorUm + "ª escolha de monstro para a batalha\n");
            System.out.printf("Escolha: ");

            do{
                escolhaJogadorUm = leitura.nextInt();

                if(escolhaJogadorUm < 1 || escolhaJogadorUm > 6){
                    System.out.println("\nMonstro não encontrado, escolha novamente!\n");
                    System.out.println("Faça sua " + controleEscolhaJogadorUm + "ª escolha de algum monstro acima\n");
                    System.out.printf("Escolha: ");
                    escolhaJogadorUm = 0;
                }


            }while(escolhaJogadorUm < 1 || escolhaJogadorUm > 6);
            
            controleEscolhaJogadorUm++;

        } while (controleEscolhaJogadorUm <= 3 );
        
    
    }
}