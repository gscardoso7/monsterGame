public class App {
    public static void main(String[] args){
        
        Monstro Beholder = new Monstro(1,"Beholder","fogo", 65, 63, 45, 45);
        Monstro Mimico = new Monstro(2, "Mimico", "grama", 45, 45, 55, 63);
        Monstro Lich = new Monstro(3, "Lich", "agua", 55, 55, 45, 45);
        Monstro Drow = new Monstro(4, "Drow", "gelo", 65, 63, 45, 45);
        Monstro Tarrasque = new Monstro(5, "Tarrasque", "agua", 65, 63, 45, 45);
        Monstro Female = new Monstro(6, "Female", "fogo", 65, 63, 45, 44);

        Escolha verificaEscolhaDoJogador = new Escolha();

        System.out.println("\t>>> Monster Game <<<");

        Beholder.Imprime();
        Mimico.Imprime();
        Lich.Imprime();
        Drow.Imprime();
        Tarrasque.Imprime();
        Female.Imprime();
        
        verificaEscolhaDoJogador.EscolhaMonstro();

    }
}