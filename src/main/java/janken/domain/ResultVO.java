package janken.domain;

import java.util.Arrays;

public enum ResultVO {

    あいこ(0), 負け(1), 勝ち(2);

    private int value;

    ResultVO(int value) {
        this.value = value;
    }

    public static ResultVO valueOf(int value) {
        return Arrays.asList(values()).stream()
                .filter(vo -> vo.getValue() == value)
                .findFirst()
                .get();
    }

    public int getValue() {
        return this.value;
    }

}
