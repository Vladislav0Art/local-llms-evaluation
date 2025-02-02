package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedCalculateSpans_SpanForConsecutiveDayIsCorrect {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_SpanForConsecutiveDayIsCorrect() {
        // given
        int[] prices = {90, 100};

        // when
        int[] spans = stockSpan.calculateSpans(prices);

        // then
        assertEquals(1, spans[0]);
        assertEquals(2, spans[1]);
    }

}