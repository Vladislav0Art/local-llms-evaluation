package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestCalculateSpans_SingleElement_1_Series_Returns_1 {

    private OnlineStockSpan subject = new OnlineStockSpan();

    @Test
    public void testCalculateSpans_SingleElement_1_Series_Returns_1() {
        int[] prices = {10};
        when(subject.next(10)).thenReturn(1);

        int result = subject.calculateSpans(prices);
        Mockito.verify(subject).calculateSpans(Mockito.eq(prices));
        assertArrayEquals({1}, actualResult);
    }

}