package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestCalculateSpans_Series_Returns_0 {

    private OnlineStockSpan subject = new OnlineStockSpan();

    @Test
    public void testCalculateSpans_Series_Returns_0() {
        int[] prices = {2, 6};
        int[][] expected = {{1}, {1}};

        int actualResult = subject.calculateSpans(prices);
        Mockito.verify(subject).calculateSpans(Mockito.eq(prices));
        for (int i = 0; i < prices.length; i++) {
            assertArrayEquals(expected[i], actualResult[i]);
        }
    }

}