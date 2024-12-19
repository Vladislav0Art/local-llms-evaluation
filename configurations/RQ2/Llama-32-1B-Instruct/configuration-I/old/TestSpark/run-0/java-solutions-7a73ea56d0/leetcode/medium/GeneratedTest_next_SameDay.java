package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_next_SameDay {

    private int price = 1;

    @Test
    public void test_next_SameDay() {
        when(price).thenReturn(4);
        onlineStockSpan.next(price);
        assertEquals(5, onlineStockSpan.next(price));
    }

}