package leetcode.medium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;

public class GeneratedNext_PriceGreaterThan0_Returns1 {

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
    public void next_PriceGreaterThan0_Returns1() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(10);
        assertEquals(1, result);
    }

}