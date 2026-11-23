public class Personagem {

    protected int vida = 100;
    protected String nome;

    public Personagem (String nome){
        this.nome = nome;
    }

    public void receberDano(int dano){
        vida = vida - dano;
    }

}



