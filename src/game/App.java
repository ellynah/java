package game;

import game.players.DiRndBot;
import game.players.ForceRndBot;
import game.players.Player;

public class App {
    public static void main(String[] args) {
        Player player = new DiRndBot();

        GameCore gc = new GameCore(player);
        gc.start();
    }
}
