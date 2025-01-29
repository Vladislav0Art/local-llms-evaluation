package leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class GeneratedTestMaxLineCoverage_EmptyPriceList_NullValues {

    @Test
    public void testMaxLineCoverage_EmptyPriceList_NullValues() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        when(getLastPriceOfPriceList(0, 1)).thenReturn(null);
        when(getHighestPriceInPosition(0)).thenReturn(null);

        int[] result = stockSpan.calculateSpans(new int[]{50, 300, 600, 7, 10});

        assertEquals(6, result.length);
        assertEquals(8, result[0]);
        assertEquals(5, result[1]);
        assertEquals(4, result[2]);
        assertEquals(null, result[3]);
    }

    public int getLastPriceOfPriceList(int... priceList) {
        return getLastPriceOfPriceList(priceList, 10);
    }

    private int getLastPriceOfPriceList(int[] priceList, int max) {
        for (int i = 0; i < priceList.length; i++) {
            if (priceList[i] > max) {
                return priceList[i];
            }
        }
        return -1;
    }

    public int getHighestPriceInPosition(int position) {
        return getHighestPriceInPosition(position, 10);
    }

    private int getHighestPriceInPosition(int position, int max) {
        for (int i = 0; i < max; i++) {
            if (prices[position] > prices[i]) {
                return prices[position];
            }
        }
        return -1;
    }

    public int getLowestPriceInPosition(int position) {
        return getLowestPriceInPosition(position, 10);
    }

    private int getLowestPriceInPosition(int position, int max) {
        for (int i = 0; i < max; i++) {
            if (prices[position] < prices[i]) {
                return prices[position];
            }
        }
        return -1;
    }

}