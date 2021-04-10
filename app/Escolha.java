import java.util.Scanner;

public class Escolha {
    public void EscolhaMonstro() {

        int escolhaJogadorUm = 0;   
        int controleEscolhaJogadorUm = 1;
        int[] monstro = new int[3];
        int i;
        Scanner leitura = new Scanner(System.in);

        for (i = 0; i < monstro.length; i++) {

            monstro[i] = monstro[i];

            do {

                System.out.println("Faça sua " + controleEscolhaJogadorUm +"ª escolha\n");
                System.out.printf("RESPOSTA: ");

                escolhaJogadorUm = leitura.nextInt();

                switch (escolhaJogadorUm) {
                    case 1:
                        System.out.println("Beholder\n");
                        
                        monstro[i]++;
                        
                        break;

                    case 2:
                        System.out.println("Mimico\n");
                        
                        monstro[i]++;
                        
                        break;
                    
                    case 3:
                        System.out.println("Lich\n");
                        
                        monstro[i]++;
                        
                        break;
                    
                    case 4:
                        System.out.println("Drow\n");
                        
                        monstro[i]++;

                        break;

                    case 5:
                        System.out.println("Tarrasque\n");
                        
                        monstro[i]++;
                        
                        break;

                    case 6:
                        System.out.println("Female\n");
                        
                        monstro[i]++;
                        
                        break;

                    default:
                        do {
                            System.out.println("Opção não encontrada, digite novamente\n");
                            System.out.println("RESPOSTA: ");

                            escolhaJogadorUm = leitura.nextInt();

                            System.out.println("\n");

                        } while (escolhaJogadorUm < 1 || escolhaJogadorUm > 6);

                        break;
                }
            
                controleEscolhaJogadorUm++;

            } while (controleEscolhaJogadorUm < 2);
        }
    }
}