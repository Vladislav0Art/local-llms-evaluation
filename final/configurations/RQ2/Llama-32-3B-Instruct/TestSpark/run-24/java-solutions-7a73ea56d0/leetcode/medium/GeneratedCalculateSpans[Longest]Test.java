package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpans[Longest]

Test {

    @Test
    public void calculateSpans[ Longest]Test() {
        OnlineStockSpan s = new OnlineStockSpan();
        int[] result = s.calculateSpans(new int[]{100, 80, 60});
        assertEquals(new int[]{2, 1, 1}, result);

        int[] result2 = s.calculateSpans(new int[]{-60, -40, -20});
        assertEquals(new int[]{1, 1, 1}, result2);
    }

}