package game.players;

import game.GameCore;

import java.util.HashSet;
import java.util.Random;

public class ForceRndBot implements Player {
    private String name;

    private int answer = 0;

    HashSet<Integer> numSet = new HashSet<Integer>();

    public ForceRndBot(String name) {
        this.name = name;
    }

    public ForceRndBot() {
        this.name = "ForceRndBot";
    }
    @Override
    public int getAnswer(GameCore.Response response) {
        checkContains();
        return this.answer;
    }


    private void checkContains() {
        this.answer = randomAnw();
        while(numSet.contains(this.answer)) {
            this.answer = randomAnw();
            numSet.add(this.answer);
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void reset() {

    }

    private int randomAnw() {
        Random ranGenerator = new Random();
        int randomInt = ranGenerator.nextInt(100) + 1;
        return randomInt;
    }
}
