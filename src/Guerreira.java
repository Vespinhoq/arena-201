public class Guerreira extends Personagem {

    private int escudo = 3;

    public void defender() {
        escudo = escudo - 1;
        System.out.println(nome+" Defende!");

    }

    public Guerreira(String nome) {
        super(nome);
        this.nome = nome;
    }
}
//C)
//Guerreira É um personagem//TEM um escudo