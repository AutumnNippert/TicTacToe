import Controllers.Controller;
import Controllers.Player;
import Controllers.TrashAI;

public class Main {
    public static void main(String[] args) {
        Controller c1 = new Player(1);
        Controller c2 = new TrashAI(2);
        Game g = new Game(c1, c2);
        g._init();
    }
}
