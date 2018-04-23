package game.players;

import game.GameCore;

public interface Player {
    int getAnswer(GameCore.Response response);
    String getName();
    void setName(String name);


    void reset();
}
