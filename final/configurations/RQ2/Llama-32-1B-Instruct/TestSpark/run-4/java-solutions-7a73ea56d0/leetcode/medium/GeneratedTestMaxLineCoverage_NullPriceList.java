package leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class GeneratedTestMaxLineCoverage_NullPriceList {

    @Test
    public void testMaxLineCoverage_NullPriceList() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        when(getLastPriceOfPriceList(null, 0)).thenReturn(new int[]{});

        int[] result = stockSpan.calculateSpans(new int[]{50, 300, 600, 7, 10});

        assertEquals(6, result.length);
        assertEquals(8, result[0]);
        assertEquals(5, result[1]);
        assertEquals(4, result[2]);
        assertEquals(20, result[3]);
    }

}