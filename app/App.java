public class App {
    public static void main(String[] args){
        
        Monstro tepig = new Monstro("Tepig","fogo",65,63,45,45);
        Monstro snivy = new Monstro("Snivy","grama",45,45,55,63);
        Monstro oshawott = new Monstro("Oshawott","agua",55,55,45,45); 
        Escolha verificaEscolhaDoJogador = new Escolha();
              
        System.out.println("Nome: " + tepig.nome +
                           "\nTipo: " + tepig.tipo+
                           "\nVida: " + tepig.vida+
                           "\nForça: " + tepig.forca+
                           "\nDefesa: " + tepig.defesa+
                           "\nVelocidade: " + tepig.velocidade+"\n");

        System.out.println("Nome: " + snivy.nome +
                           "\nTipo: " + snivy.tipo+
                           "\nVida: " + snivy.vida+
                           "\nForça: " + snivy.forca+
                           "\nDefesa: " + snivy.defesa+
                           "\nVelocidade: " + snivy.velocidade+"\n");

        System.out.println("Nome: " + oshawott.nome +
                           "\nTipo: " + oshawott.tipo+
                           "\nVida: " + oshawott.vida+
                           "\nForça: " + oshawott.forca+
                           "\nDefesa: " + oshawott.defesa+
                           "\nVelocidade: " + oshawott.velocidade+"\n");
        
        verificaEscolhaDoJogador.EscolhaMonstro();

    }
}