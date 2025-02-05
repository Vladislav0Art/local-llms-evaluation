package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedCalculateSpansMultipleTest {

    @Test
    public void calculateSpansMultipleTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{100, 80, 60, 70, 60, 75, 85});

        assertEquals(result[0], 1);
        assertEquals(result[1], 1);
        assertEquals(result[2], 1);
        assertEquals(result[3], 2);
        assertEquals(result[4], 1);
        assertEquals(result[5], 4);
        assertEquals(result[6], 6);
    }

}