package janken.app;

import janken.domain.ResultVO;
import janken.domain.game.Game;
import janken.domain.game.GameCounter;

public class Janken {

    private GameCounter counter = new GameCounter();

    private Game game = new Game();

    public static void main(String[] args) {
        try {
            new Janken().execute();
        } catch (Exception e) {
            System.out.println("Unexpected error. " + e);
        }

    }

    public int execute() {
        System.out.printf("じゃんけん%d本勝負です。\n", counter.getGameCount());

        ResultVO resultVO = game.startGames(counter);

        System.out.println("-- 結果 --");
        System.out.printf("あなたの%s！ (%d勝%d敗)", resultVO.name(), counter.getWin(), counter.getLose());

        return 0;

    }



}
