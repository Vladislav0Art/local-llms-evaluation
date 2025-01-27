package leetcode.medium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;

public class GeneratedCalculateSpans_MultipleElementArray_ReturnsCorrectSpans {

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
    public void calculateSpans_MultipleElementArray_ReturnsCorrectSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 7, 5, 8, 11, 9};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(new int[]{1, 1, 1, 2, 3, 4}, result);
    }

}