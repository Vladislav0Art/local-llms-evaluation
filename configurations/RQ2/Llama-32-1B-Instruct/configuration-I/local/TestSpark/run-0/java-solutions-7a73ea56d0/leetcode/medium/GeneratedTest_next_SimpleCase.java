package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_next_SimpleCase {

    private int price = 1;

    @Test
    public void test_next_SimpleCase() {
        when(price).thenReturn(0);
        onlineStockSpan.next(price);
        assertEquals(2, onlineStockSpan.next(price));
    }

}