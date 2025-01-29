package leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class GeneratedTestMaxLineCoverage_DifferentPrices {

    @Test
    public void testMaxLineCoverage_DifferentPrices() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        when(getLastPriceOfPriceList(0, 1)).thenReturn(new int[]{100, 200});
        when(getHighestPriceInPosition(0)).thenReturn(300);
        when(getLowestPriceInPosition(1)).thenReturn(10);

        int[] result = stockSpan.calculateSpans(new int[]{50, 300, 600, 7, 10});

        assertEquals(6, result.length);
        assertEquals(3, result[0]);
        assertEquals(5, result[1]);
        assertEquals(4, result[2]);
        assertEquals(8, result[3]);
        assertEquals(20, result[4]);
    }

}