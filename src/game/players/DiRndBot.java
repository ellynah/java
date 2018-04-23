package game.players;

import game.GameCore;

import java.util.Random;

public class DiRndBot implements Player {
    private String name;

    private int left = 1;
    private int right = 100;
    private int answer = 50;

    public DiRndBot(String name) {
        this.name = name;
    }

    public DiRndBot() {
        this.name = "DiRndBot";
    }

    @Override
    public int getAnswer(GameCore.Response response) {
        if(response == GameCore.Response.LEFT) {
            this.left = this.answer;
        } else if (response == GameCore.Response.RIGHT){
            this.right = this.answer;
        }
        this.answer = RandomFromTo(left, right);

        System.out.println(answer);
        return this.answer;
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
        this.left = 1;
        this.right = 100;
        this.answer = 50;
        this.name = "DiRndBot";

    }

    private int RandomFromTo(int left, int right) {
        Random ranGenerator = new Random();
        int randomInt = left + ranGenerator.nextInt(right - left);
        return randomInt;
    }
}
