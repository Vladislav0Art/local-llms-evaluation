package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansMultiplePricesTest {

    @Test
    public void calculateSpansMultiplePricesTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[]{100, 80, 75, 70, 60, 65});
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(1, result[2]);
        assertEquals(2, result[3]);
        assertEquals(1, result[4]);
        assertEquals(1, result[5]);
    }

}