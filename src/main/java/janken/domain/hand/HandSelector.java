package janken.domain.hand;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class HandSelector {

    public HandVO select() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try {
            return convert2HandVO(br.readLine());
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }

    }

    private HandVO convert2HandVO(String key) {
        switch (key) {
        case "j":
            return HandVO.グー;
        case "k":
            return HandVO.チョキ;
        default:
            return HandVO.パー;
        }

    }

    public HandVO selectRandom() {
        int randomNumber = new Random().nextInt(3);

        switch (randomNumber) {
        case 0:
            return HandVO.グー;
        case 1:
            return HandVO.チョキ;
        case 2:
            return HandVO.パー;
        default:
            throw new IllegalArgumentException();
        }

    }

}
