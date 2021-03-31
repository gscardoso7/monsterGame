import java.util.Scanner;

public class Escolha {
    public void EscolhaMonstro() {

        Scanner leitura = new Scanner(System.in);
        int escolhaJogadorUm = 0;
        int controleEscolhaJogadorUm = 1;
        
        do {

            System.out.println(" ");
            System.out.println("Faça sua " + controleEscolhaJogadorUm + "ª escolha de monstro para a batalha\n");

            System.out.println("1: Fergie de fogo");
            System.out.println("2: Bola de água");
            System.out.println("3: Formiga do vento");
            System.out.println("4: Fergie de água");
            System.out.println("5: Bola de terra");
            System.out.println("6: Formiga do gelo");
            System.out.printf("\nEscolha: ");


            do {
                escolhaJogadorUm = leitura.nextInt();

                if (escolhaJogadorUm < 1 || escolhaJogadorUm > 6){

                    System.out.println("Monstro não encontrado, escolha novamente!");
                    System.out.println("Faça sua " + controleEscolhaJogadorUm + "ª escolha de monstro para a batalha\n");
                    escolhaJogadorUm = 0;
                }

            } while(escolhaJogadorUm < 1 || escolhaJogadorUm > 6);
            
            controleEscolhaJogadorUm++;

        } while (controleEscolhaJogadorUm <= 3 );
    }
}



