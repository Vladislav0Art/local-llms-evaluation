package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_calculateSpans_DifferentDay {

    private int price = 1;

    @Test
    public void test_calculateSpans_DifferentDay() {
        OnlineStockSpan.Span span = onlineStockSpan.calculateSpans(new int[]{1, 5});
        assertEquals(3, span.getSpan());
    }

}