package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_calculateSpans_SimpleCase {

    private int price = 1;

    @Test
    public void test_calculateSpans_SimpleCase() {
        OnlineStockSpan.Span span = onlineStockSpan.calculateSpans(new int[]{1, 5});
        assertEquals(0, span.getSpan());
    }

}