package janken.domain.hand;

public enum HandVO {

    グー(0), チョキ(1), パー(2),
    ;

    private int value;

    private HandVO(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}
