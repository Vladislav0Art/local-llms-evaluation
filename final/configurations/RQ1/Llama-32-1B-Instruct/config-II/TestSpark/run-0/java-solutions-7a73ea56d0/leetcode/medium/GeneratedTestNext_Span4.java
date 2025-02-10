package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

import java.util.Arrays;

public class GeneratedTestNext_Span4 {

    @Test
    public void testNext_Span4() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 13;
        int expected = 2;
        int[] result = onlineStockSpan.next(price);
        assertEquals(expected, result);
    }

}