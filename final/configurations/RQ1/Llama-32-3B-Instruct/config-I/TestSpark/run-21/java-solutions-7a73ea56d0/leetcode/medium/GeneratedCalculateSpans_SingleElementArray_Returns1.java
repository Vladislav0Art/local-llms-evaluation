package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedCalculateSpans_SingleElementArray_Returns1 {

    @Test
    public void calculateSpans_SingleElementArray_Returns1() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        when("prices").thenReturn(new int[]{10});
        int[] result = onlineStockSpan.calculateSpans(new int[]{10});
        assertArrayEquals(result, new int[]{1});
    }

}