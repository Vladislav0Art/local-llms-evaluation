package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestCalculateSpans_Empty_0_Series_Returns_0 {

    private OnlineStockSpan subject = new OnlineStockSpan();

    @Test
    public void testCalculateSpans_Empty_0_Series_Returns_0() {
        int[] prices = {};
        int[][] expected = {{0}};

        int actualResult = subject.calculateSpans(prices);
        Mockito.verify(subject).calculateSpans(Mockito.eq(prices));
        assertArrayEquals(expected[0], actualResult);
    }

}