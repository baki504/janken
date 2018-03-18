package janken.domain.game;

public class GameCounter {

    private int game = 3;

    private int currentGame = 1;

    private int win;

    public void add(boolean isWin) {
        currentGame++;

        if (isWin) {
            win++;
        }

    }

    public void resetCounter() {
        currentGame = 1;
        win = 0;
    }

    public int getGameCount() {
        return game;
    }

    public int getCurrentGame() {
        return currentGame;
    }

    public int getWin() {
        return win;
    }

    public int getLose() {
        return game - win;
    }

}
