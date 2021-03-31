public class Monstro{
    String nome;
    String tipo;
    int vida;
    int forca;
    int defesa;
    int velocidade;


    public Monstro(String nome, String tipo, int vida, int forca,int defesa, int velocidade){
        this.nome = nome;
        this.tipo = tipo;
        this.vida = vida;
        this.forca = forca;
        this.defesa = defesa;
        this.velocidade = velocidade;

    }

    public void Imprime(){
        System.out.println("Nome: " + this.nome+
                            "\nTipo: " + this.tipo+
                            "\nVida: " + this.vida+
                            "\nForça: " + this.forca+
                            "\nDefesa: " + this.defesa+
                            "\nVelocidade: " + this.velocidade+"\n");


    }
}