package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedCalculateSpans_SingleElementArrayWithPrice0_Returns1 {

    @Test
    public void calculateSpans_SingleElementArrayWithPrice0_Returns1() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        when("prices").thenReturn(new int[]{0});
        int[] result = onlineStockSpan.calculateSpans(new int[]{0});
        assertArrayEquals(result, new int[]{1});
    }

}