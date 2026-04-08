package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] numbers = new int[12];

    /**
     *
     * @return
     */
    public int getTotal() {
        return total;
    }

    private int total = -1;

    /**
     *
     * @param in
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     *
     * @return
     */
    public boolean callCheck() {
        return total == -1;
    }
    /**
     *
     * @return
     */
    public boolean isFull() {
        return total == 11;
    }
    /**
     *
     * @return
     */
    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }
    /**
     *
     * @return
     */
    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
