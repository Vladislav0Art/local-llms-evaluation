package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_calculateSpans_SamePrice {

    private int price = 1;

    @Test
    public void test_calculateSpans_SamePrice() {
        OnlineStockSpan.Span span = onlineStockSpan.calculateSpans(new int[]{1, 4});
        assertEquals(0, span.getSpan());
    }

}