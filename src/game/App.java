package game;

import game.players.ForceRndBot;
import game.players.Player;

public class App {
    public static void main(String[] args) {
        //Player player = new HumanPlayer("Ivan");
        //Player player = new ForceBot();
        //Player player = new DiBot();
        //Player player = new DiRndBot();
        Player player = new ForceRndBot();

        GameCore gc = new GameCore(player);
        gc.start();
    }
}
