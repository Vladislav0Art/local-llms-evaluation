package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedCalculateSpansArrayWithAllSameValuesTest {

    @Test
    public void calculateSpansArrayWithAllSameValuesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{50, 50, 50, 50});
        assertArrayEquals(new int[]{1, 2, 3, 4}, result);
    }

}