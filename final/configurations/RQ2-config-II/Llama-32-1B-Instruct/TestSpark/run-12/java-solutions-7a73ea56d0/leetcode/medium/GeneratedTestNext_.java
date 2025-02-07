package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestNext_ {

    @Test
    public void testNext_() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price = 10;
        when(next(5)).thenReturn(price + 1);
        int result = instance.next(price);
        assertEquals(2, result);

        price = 7;
        result = instance.next(price);
        assertEquals(1, result);
    }

}