package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

@RunWith(SimpleJUnit4ClassRunner.class)
public class GeneratedNext_NegativeNumber_Returns1 {

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
    public void next_NegativeNumber_Returns1() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(-1);
        assertEquals(1, result);
    }

}