package janken.domain;

import janken.domain.game.GameCounter;
import janken.domain.hand.HandVO;

public class Judger {

    public ResultVO judgeGame(HandVO player, HandVO computer) {
        int resultCode = (player.getValue() - computer.getValue() + 3) % 3;
        return ResultVO.valueOf(resultCode);
    }

    public ResultVO judgeGames(GameCounter counter) {
        return counter.getWin() > counter.getLose() ? ResultVO.勝ち : ResultVO.負け;

    }

}
