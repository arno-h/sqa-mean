package at.campus02;

public class BetterMean {

    /* This only works, because double has enough precision to
     * not lose some digits along the way (and because int is
     * only 32 bit in Java). A bit brittle, but ok.
     */
    public static int meanWithCasts(int a, int b) {
        return (int)(((double)a + (double)b) / 2);
    }

    /* First we divide by 2, only then add the numbers.
     * Problem: if both numbers are odd, then we'd get a
     * wrong result. Therefore, we check if the numbers are
     * odd (%2 == modulo 2 (Rest nach Division von 2)).
     * If both are odd, then we add another number.
     * Due to our definition (mean(-3, -8) == -5, i.e. rounding
     * towards zero), we need an additional if-clause.
     */
    public static int meanByHalvingFirst(int a, int b) {
        // addition does not overrun, because we half first
        int mean = (a / 2) + (b / 2);
        // if both numbers are odd, correct mean by +-1
        // (Note: 7 % 2 == 1; -7 % 2 == -1)
        mean += ((a % 2) + (b % 2)) / 2;
        // because we round towards zero (-9.5 -> -9) we
        // need an extra correction
        if (mean < 0 && (a % 2 + b % 2 == 1))
            mean++;
        return mean;
    }
}
