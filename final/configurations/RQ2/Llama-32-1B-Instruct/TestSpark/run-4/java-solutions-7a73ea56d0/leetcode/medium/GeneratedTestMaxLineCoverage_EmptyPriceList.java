package leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class GeneratedTestMaxLineCoverage_EmptyPriceList {

    @Test
    public void testMaxLineCoverage_EmptyPriceList() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        when(getLastPriceOfPriceList(0, 1)).thenReturn(new int[]{});

        int[] result = stockSpan.calculateSpans(new int[]{5, 2, 8, 4});

        assertEquals(3, result.length);
        assertEquals(8, result[0]);
        assertEquals(7, result[1]);
        assertEquals(10, result[2]);
    }

}