package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

import java.util.Arrays;

public class GeneratedTestNext_Span1 {

    @Test
    public void testNext_Span1() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 10;
        int expected = 1;
        int[] result = onlineStockSpan.next(price);
        assertEquals(expected, result);
    }

}