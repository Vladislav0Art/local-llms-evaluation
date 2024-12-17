package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_next_DifferentDay {

    private int price = 1;

    @Test
    public void test_next_DifferentDay() {
        when(price).thenReturn(2);
        onlineStockSpan.next(price);
        assertEquals(6, onlineStockSpan.next(price));
    }

}