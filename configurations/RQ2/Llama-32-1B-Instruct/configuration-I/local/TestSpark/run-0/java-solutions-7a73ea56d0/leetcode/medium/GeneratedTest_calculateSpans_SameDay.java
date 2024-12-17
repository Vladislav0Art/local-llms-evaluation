package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_calculateSpans_SameDay {

    private int price = 1;

    @Test
    public void test_calculateSpans_SameDay() {
        OnlineStockSpan.Span span = onlineStockSpan.calculateSpans(new int[]{1, 5});
        assertEquals(0, span.getSpan());
    }

}