import java.util.ArrayList;
import java.util.Scanner;

public class Escolha {
    public void EscolhaMonstro() {

        int escolhaJogadorUm = 0;   
        int controleEscolhaJogadorUm = 1;
        String armazenaListagem[] = new String[3];

        ArrayList<String> percorreListagemDeMonstros = new ArrayList();

        Scanner leitura = new Scanner(System.in);


        do {
            do {
                System.out.println("Faça sua " + controleEscolhaJogadorUm +"ª escolha\n");
                System.out.printf("RESPOSTA: ");

                escolhaJogadorUm = leitura.nextInt();

                switch (escolhaJogadorUm) {
                    case 1:
                        System.out.println("Beholder\n");

                        percorreListagemDeMonstros.add("Beholder");

                        break;

                    case 2:
                        System.out.println("Mimico\n");

                        percorreListagemDeMonstros.add("Mimico");

                        break;
                    
                    case 3:
                        System.out.println("Lich\n");

                        percorreListagemDeMonstros.add("Lich");

                        break;
                    
                    case 4:
                        System.out.println("Drow\n");

                        percorreListagemDeMonstros.add("Drow");

                        break;

                    case 5:
                        System.out.println("Tarrasque\n");

                        percorreListagemDeMonstros.add("Tarrasque");

                        break;

                    case 6:
                        System.out.println("Female\n");
            
                        percorreListagemDeMonstros.add("Female");

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
                
            } while (controleEscolhaJogadorUm <= 3);
            
            armazenaListagem[0] = percorreListagemDeMonstros.get(0);
            System.out.println(armazenaListagem[0]);

            armazenaListagem[1] = percorreListagemDeMonstros.get(1);
            System.out.println(armazenaListagem[1]);
            
            armazenaListagem[2] = percorreListagemDeMonstros.get(2);
            System.out.println(armazenaListagem[2]);
            

            if (armazenaListagem[0] == armazenaListagem[1] || armazenaListagem[0] == armazenaListagem[2] || armazenaListagem[1] == armazenaListagem[2]){
                System.out.println("Monstro já escolhido. Escolha outro para a batalha.\n");
                System.out.println("RESPOSTA: ");
                escolhaJogadorUm = leitura.nextInt();
            }
            
            //Print abaixo somente para teste, desconsiderar na versão final do código.
            System.out.println(percorreListagemDeMonstros);
        } while(false);
            


        //Print abaixo somente para teste, desconsiderar na versão final do código.
        //System.out.println(percorreListagemDeMonstros);

    }
}