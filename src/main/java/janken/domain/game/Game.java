package janken.domain.game;

import janken.domain.Judger;
import janken.domain.ResultVO;
import janken.domain.hand.HandSelector;
import janken.domain.hand.HandVO;

public class Game {

    private HandSelector handSelector = new HandSelector();

    private Judger judger = new Judger();

    public ResultVO startGames(GameCounter counter) {

        for (int i = 0; i < counter.getGameCount(); i++) {
            System.out.printf("-- %d本目 --\n", counter.getCurrentGame());

            boolean isWin = startGame();
            counter.add(isWin);

            System.out.printf("あなたの%sです。\n", isWin ? ResultVO.勝ち.name() : ResultVO.負け.name());

        }

        return judger.judgeGames(counter);

    }
    public boolean startGame() {
        System.out.println("j: グー\nk: チョキ\nそれ以外: パー");
        System.out.print("あなたの手を選択してください。⇒");

        HandVO player = handSelector.select();
        HandVO computer = handSelector.selectRandom();

        System.out.printf("あなた: %s、コンピュータ: %s\n", player.name(), computer.name());
        ResultVO result = judger.judgeGame(player, computer);

        if (result == ResultVO.あいこ) {
            System.out.println("あいこです。");
            startGame();
        }

        return result == ResultVO.勝ち ? true : false;

    }

}
