package leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void testMaxLineCoverage() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        when(getLastPriceOfPriceList(3, 2, 1)).thenReturn(new int[]{2, 4, 5});
        when(getHighestPriceInPosition(0)).thenReturn(100);
        when(getLowestPriceInPosition(1)).thenReturn(50);

        int[] result = stockSpan.calculateSpans(new int[]{50, 300, 600, 7, 10});

        assertEquals(6, result.length);
        assertEquals(3, result[0]);
        assertEquals(5, result[1]);
        assertEquals(4, result[2]);
        assertEquals(8, result[3]);
        assertEquals(10, result[4]);
    }

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