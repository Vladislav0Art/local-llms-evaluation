package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_calculateSpans_DifferentPrice {

    private int price = 1;

    @Test
    public void test_calculateSpans_DifferentPrice() {
        OnlineStockSpan.Span span = onlineStockSpan.calculateSpans(new int[]{1, 3});
        assertEquals(2, span.getSpan());
    }

}