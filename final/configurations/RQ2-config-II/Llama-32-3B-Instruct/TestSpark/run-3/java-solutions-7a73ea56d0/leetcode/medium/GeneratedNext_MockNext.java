package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class GeneratedNext_MockNext {

    @Test
    public void next_MockNext() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        when(onlineStockSpan.next(anyInt())).thenReturn(1);
        int[] result = onlineStockSpan.calculateSpans(new int[]{10, 7, 5, 8, 11, 9});
        assertEquals(6, result[0]);
    }

}