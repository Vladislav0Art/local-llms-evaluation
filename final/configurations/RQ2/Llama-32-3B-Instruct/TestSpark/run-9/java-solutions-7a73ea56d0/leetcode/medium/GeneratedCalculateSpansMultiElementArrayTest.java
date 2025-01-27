package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansMultiElementArrayTest {

    @Test
    public void calculateSpansMultiElementArrayTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{10, 12, 7, 5, 8});
        assertEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

}