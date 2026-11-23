//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main() {

        Guerreira geribalda = new Guerreira("Geribalda");
        geribalda.receberDano(20);
        geribalda.defender();
        System.out.println("Vida de Geribalda:"+geribalda.vida);

    }
}
