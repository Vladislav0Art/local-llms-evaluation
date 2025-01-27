package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpans[Int]

Test {

    @Test
    public void calculateSpans[ Int]Test() {
        OnlineStockSpan s = new OnlineStockSpan();
        int[] result = s.calculateSpans(new int[]{100});
        assertEquals(new int[]{1}, result);

        int[] result2 = s.calculateSpans(new int[]{-60});
        assertEquals(new int[]{1}, result2);

        int[] result3 = s.calculateSpans(new int[]{120, -40});
        assertEquals(new int[]{2, 1}, result3);
    }

}