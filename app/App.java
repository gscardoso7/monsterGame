public class App {
    public static void main(String[] args){
        
        Monstro tepig = new Monstro("Tepig","fogo",65,63,45,45);
        Monstro snivy = new Monstro("Snivy","grama",45,45,55,63);
        Monstro oshawott = new Monstro("Oshawott","agua",55,55,45,45); 
        Escolha verificaEscolhaDoJogador = new Escolha();
        
        tepig.Imprime();
        snivy.Imprime();
        oshawott.Imprime();

       
        
        verificaEscolhaDoJogador.EscolhaMonstro();

    }
}