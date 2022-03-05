package at.campus02;

import org.junit.Assert;
import org.junit.Test;

public class TestMean {

    @Test
    public void testMeanPosOverflow() {
        int res = Mean.mean(
                Integer.MAX_VALUE - 1,
                Integer.MAX_VALUE
        );
        Assert.assertEquals(Integer.MAX_VALUE - 1, res);
    }

    @Test
    public void testMeanNegOverflow() {
        int res = Mean.mean(
                Integer.MIN_VALUE,
                Integer.MIN_VALUE
        );
        Assert.assertEquals(Integer.MIN_VALUE, res);
    }

    @Test
    public void testMeanPositive() {
        int res = Mean.mean(4, 8);
        Assert.assertEquals(6, res);
    }

    @Test
    public void testMeanRoundDown() {
        int res = Mean.mean(4, 11);
        Assert.assertEquals(7, res);
    }

    @Test
    public void testMeanZero() {
        int res = Mean.mean(-5, 5);
        Assert.assertEquals(0, res);
    }

    @Test
    public void testMeanBothNegative() {
        int res = Mean.mean(-5, -15);
        Assert.assertEquals(-10, res);
    }

    @Test
    public void testMeanBothNegativeRound() {
        int res = Mean.mean(-5, -20);
        Assert.assertEquals(-12, res);
    }

    @Test
    public void testMeanPosNegRound() {
        int res = Mean.mean(1, -20);
        Assert.assertEquals(-9, res);
    }
}
