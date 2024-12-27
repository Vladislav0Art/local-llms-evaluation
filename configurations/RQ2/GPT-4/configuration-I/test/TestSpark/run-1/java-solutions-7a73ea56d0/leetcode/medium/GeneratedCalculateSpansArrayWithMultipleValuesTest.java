package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedCalculateSpansArrayWithMultipleValuesTest {

    @Test
    public void calculateSpansArrayWithMultipleValuesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{100, 75, 85, 70, 80, 100});
        assertArrayEquals(new int[]{1, 1, 2, 1, 2, 5}, result);
    }

}