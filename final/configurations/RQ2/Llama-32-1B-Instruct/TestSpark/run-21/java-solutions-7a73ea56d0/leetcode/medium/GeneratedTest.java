package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void test_maxLineCoverage() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {7, 1, 5, 3, 6, 4};
        when(instance.next(2)).thenReturn(0);
        when(instance.next(7)).thenReturn(1);
        List<int[]> result = new ArrayList<>();
        instance.calculateSpans(prices, result);
        assertEquals(4, result.size());
    }

    @Test
    public void test_maxLineCoverage_SinglePrice() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price = 2;
        when(instance.next(price)).thenReturn(1);
        List<int[]> result = new ArrayList<>();
        instance.calculateSpans(prices, result);
        assertEquals(0, result.size());
    }

    @Test
    public void test_maxLineCoverage_ExistingPrice() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price = 7;
        when(instance.next(price)).thenReturn(1);
        List<int[]> result = new ArrayList<>();
        instance.calculateSpans(prices, result);
        assertEquals(1, result.size());
    }

    @Test
    public void test_maxLineCoverage_SamePrice() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price = 7;
        when(instance.next(price)).thenReturn(1);
        List<int[]> result = new ArrayList<>();
        instance.calculateSpans(prices, result);
        assertEquals(2, result.size());
    }

    @Test
    public void test_maxLineCoverage_SamePriceMultipleTimes() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price = 7;
        when(instance.next(price)).thenReturn(1);
        List<int[]> result = new ArrayList<>();
        instance.calculateSpans(prices, result);
        assertEquals(2, result.size());
    }

    @Test
    public void test_maxLineCoverage_SamePriceMultipleTimesWithDifferentPrices() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price1 = 7;
        int price2 = 3;
        when(instance.next(price1)).thenReturn(1);
        when(instance.next(price2)).thenReturn(1);
        List<int[]> result = new ArrayList<>();
        instance.calculateSpans(prices, result);
        assertEquals(2, result.size());
    }

    @Test
    public void test_maxLineCoverage_SamePriceMultipleTimesWithDifferentPricesAndExistingPrice() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price1 = 7;
        int price2 = 3;
        when(instance.next(price1)).thenReturn(1);
        when(instance.next(price2)).thenReturn(1);
        List<int[]> result = new ArrayList<>();
        instance.calculateSpans(prices, result);
        assertEquals(2, result.size());
    }

    public void calculateSpans(int[] prices, List<int[]> results) {
        for (int price : prices) {
            when(instance.next(price)).thenReturn(results.get(results.size() - 1).get(0));
            results.add(new int[]{price});
        }
    }

}