package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

@RunWith(SimpleJUnit4ClassRunner.class)
public class GeneratedCalculateSpans_SingleElementArray_ReturnsSingleElement {

    @RunWith(SimpleJUnit4ClassRunner.class)
    public static class OnlineStockSpan {
        public int next(int x) {
            return 1; // Replace with actual implementation
        }

        public int[] calculateSpans(int[] prices) {
            return new int[0]; // Replace with actual implementation
        }
    }

    @Test
    public void calculateSpans_SingleElementArray_ReturnsSingleElement() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {1};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(1, result[0]);
    }

}