package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

import java.util.Arrays;

public class GeneratedTestNext_Span2 {

    @Test
    public void testNext_Span2() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 12;
        int expected = 3;
        int[] result = onlineStockSpan.next(price);
        assertEquals(expected, result);
    }

}