public class Monstro{
    int ID;
    String nome;
    String tipo;
    int vida;
    int forca;
    int defesa;
    int velocidade;


    public Monstro(int ID, String nome, String tipo, int vida, int forca,int defesa, int velocidade){
        this.ID = ID;
        this.nome = nome;
        this.tipo = tipo;
        this.vida = vida;
        this.forca = forca;
        this.defesa = defesa;
        this.velocidade = velocidade;

    }

    public void Imprime(){
        System.out.println("ID: " + this.ID +
                            "\nNome: " + this.nome +
                            "\nTipo: " + this.tipo +
                            "\nVida: " + this.vida +
                            "\nForça: " + this.forca +
                            "\nDefesa: " + this.defesa +
                            "\nVelocidade: " + this.velocidade + "\n");


    }
}