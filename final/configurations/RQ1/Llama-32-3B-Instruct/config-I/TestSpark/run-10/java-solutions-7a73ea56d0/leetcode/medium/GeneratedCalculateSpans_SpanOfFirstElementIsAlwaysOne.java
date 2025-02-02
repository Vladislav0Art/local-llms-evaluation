package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedCalculateSpans_SpanOfFirstElementIsAlwaysOne {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_SpanOfFirstElementIsAlwaysOne() {
        // given
        int[] prices = {100};

        // when
        int[] spans = stockSpan.calculateSpans(prices);

        // then
        assertEquals(1, spans[0]);
    }

}