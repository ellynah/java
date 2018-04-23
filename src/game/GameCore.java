package game;

import game.players.Player;

import java.util.Random;

public class GameCore {

    private Player player;

    private int value;

    private int count;
    {
        count = 0;
    }

    public enum Response { LEFT, RIGHT, MATCH; }

    public GameCore(Player player) {
        this.player = player;
    }

    private void before() {
        this.value = RandomRange();
        this.count = 0;
        System.out.println("Приветствую, " + player.getName());
        System.out.println("отгадайте число от 1 до 100");
    }

    public void start() {
        before();
        int answer;
        Response response = null;
        do {
            answer = player.getAnswer(response);
            response = checkAnswer(answer);
            count++;
        } while(answer != value);
        after();
    }

    void after() {
        String str = "Победа. Загаданное число было " + this.value + ". Число попыток " + this.count;
        System.out.println(str);
        player.reset();
    }

    private Response checkAnswer(int answer) {
        Response response = Response.MATCH;
        //System.out.println(value);
        if(answer > value) {
            response = Response.RIGHT;
            System.out.println("Ваше число больше загаданного");
        } else if (answer < value) {
            response = Response.LEFT;
            System.out.println("Ваше число меньше загаданного");
        }
        return response;
    }

    private int RandomRange() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100) + 1;
        return randomInt;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

}
