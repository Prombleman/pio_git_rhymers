package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int INITIAL_TOTAL = -1; [cite: 106]
    public static final int MAX_SIZE = 12; [cite: 106]
    public static final int FULL_THRESHOLD = 11;

    private final int[] NUMBERS = new int[MAX_SIZE]; [cite: 107]
    private int total = INITIAL_TOTAL; [cite: 130]

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == INITIAL_TOTAL; [cite: 106]
    }

    public boolean isFull() {
        return total == FULL_THRESHOLD;
    }

    protected int peekaboo() {
        if (callCheck())
            return INITIAL_TOTAL; [cite: 106]
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return INITIAL_TOTAL; [cite: 106]
        return NUMBERS[total--];
    }

    public int getTotal() { [cite: 131]
        return total; [cite: 131]
    }

}