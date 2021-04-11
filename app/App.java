import java.util.Scanner;

public class App {
    public static void main(String[] args){
        
        int resposta;

        Scanner leitura = new Scanner(System.in);

        Monstro Beholder = new Monstro(1, "Beholder","fogo", 65, 63, 45, 45);
        Monstro Mimico = new Monstro(2, "Mimico", "grama", 45, 45, 55, 63);
        Monstro Lich = new Monstro(3, "Lich", "agua", 55, 55, 45, 45);
        Monstro Drow = new Monstro(4, "Drow", "gelo", 65, 63, 45, 45);
        Monstro Tarrasque = new Monstro(5, "Tarrasque", "agua", 65, 63, 45, 45);
        Monstro Female = new Monstro(6, "Female", "fogo", 65, 63, 45, 44);

        Escolha verificaEscolhaDoJogador = new Escolha();

        Menu menuInteracaoComUsuario = new Menu();
        resposta = menuInteracaoComUsuario.menuInteracao();
        
        if(resposta == 1) {
            Beholder.Imprime();
            Mimico.Imprime();
            Lich.Imprime();
            Drow.Imprime();
            Tarrasque.Imprime();
            Female.Imprime();

            verificaEscolhaDoJogador.EscolhaMonstro();

            /* 
            Comentários escritos abaixo para facilitar testes,
            Não deve ser usado pois o menu necessita de algumas
            mudanças.
            */

            /*
            switch (resposta) {
                case 1:
                    verificaEscolhaDoJogador.EscolhaMonstro();
                    break;
                
                case 2:
                    System.out.println("Até a próxima jogador!");
                    break;

                default:
                    do {
                        System.out.println("Opção não encontrada, responda novamente!\n");
                        System.out.println("RESPOSTA: ");

                        resposta = leitura.nextInt();

                        System.out.println("\n");

                    } while(resposta < 1 || resposta > 2);

                    break;
            }
            */
        }

        /*
        else if(resposta == 2){
            System.out.println("Regras do jogo: ");
            System.out.println("1- O mesmo jogador não poderá escolher o mesmo monstro");
            System.out.println("2- Existem as prioridades de desempate para quem vai atacar primeiro");
            System.out.println("3- O jogador 2 não tem desvantagem por ser 2");

            System.out.println("O que deseja fazer?");
            System.out.println("\t 1- Voltar ao menu");
            System.out.println("\t 2- Jogar partida arcade!");
            System.out.println("\t 3- Sair");

            
            /*
            if (resposta == 1) {

            }
            *

            if (resposta == 2) {
                verificaEscolhaDoJogador.EscolhaMonstro();
            }

            else if (resposta == 3) {
                System.out.println("Sessão encerrada Monster Gamer");
                System.out.println("Até a próxima");
            }
        }

        */
        else if (resposta == 3) {
            System.out.println("Sessão encerrada Monster Gamer");
            System.out.println("Até a próxima");
        }

        

    }
}