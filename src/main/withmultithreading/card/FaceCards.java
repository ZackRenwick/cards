package main.withmultithreading.card;


public enum FaceCards {
    JACK(11), QUEEN(12), KING(13);

    private int value;

    private FaceCards(int value ) {
        this.value = value;
    } 

    public int getValue() {
        return value;
    }
}