package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpans[Diverging]

Test {

    @Test
    public void calculateSpans[ Diverging]Test() {
        OnlineStockSpan s = new OnlineStockSpan();
        int[] result = s.calculateSpans(new int[]{100, 80});
        assertEquals(new int[]{2, 1}, result);

        int[] result2 = s.calculateSpans(new int[]{-60, -40});
        assertEquals(new int[]{1, 1}, result2);
    }

}