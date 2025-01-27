package leetcode.medium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;

public class GeneratedCalculateSpans_SingleElementArray_ReturnsSingleElementArray {

    public int next(int price) {
        return 1;
    }

    public int[] calculateSpans(int[] prices) {
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            result[i] = 1;
        }
        return result;
    }
}

public class Test {

    @Test
    public void calculateSpans_SingleElementArray_ReturnsSingleElementArray() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(new int[]{1}, result);
    }

}