package at.campus02;

import org.junit.Assert;
import org.junit.Test;

public class TestBetterMean {

    @Test
    public void testMeanPosOverflow() {
        int res = BetterMean.meanByHalvingFirst(
                Integer.MAX_VALUE - 1,
                Integer.MAX_VALUE
        );
        Assert.assertEquals(Integer.MAX_VALUE - 1, res);
    }

    @Test
    public void testMeanNegOverflow() {
        int res = BetterMean.meanByHalvingFirst(
                Integer.MIN_VALUE,
                Integer.MIN_VALUE
        );
        Assert.assertEquals(Integer.MIN_VALUE, res);
    }

    @Test
    public void testMeanPositive() {
        int res = BetterMean.meanByHalvingFirst(4, 8);
        Assert.assertEquals(6, res);
    }

    @Test
    public void testMeanRoundDown() {
        int res = BetterMean.meanByHalvingFirst(4, 11);
        Assert.assertEquals(7, res);
    }

    @Test
    public void testMeanZero() {
        int res = BetterMean.meanByHalvingFirst(-5, 5);
        Assert.assertEquals(0, res);
    }

    @Test
    public void testMeanBothNegative() {
        int res = BetterMean.meanByHalvingFirst(-5, -15);
        Assert.assertEquals(-10, res);
    }

    @Test
    public void testMeanBothNegativeRound() {
        int res = BetterMean.meanByHalvingFirst(-5, -20);
        Assert.assertEquals(-12, res);
    }

    @Test
    public void testMeanPosNegRound() {
        int res = BetterMean.meanByHalvingFirst(1, -20);
        Assert.assertEquals(-9, res);
    }

    @Test
    public void testMeanPosNegNoRound() {
        int res = BetterMean.meanByHalvingFirst(4, -20);
        Assert.assertEquals(-8, res);

        res = BetterMean.meanByHalvingFirst(5, -21);
        Assert.assertEquals(-8, res);
    }
}
