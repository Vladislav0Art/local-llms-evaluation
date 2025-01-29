package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_maxLineCoverage_SamePriceMultipleTimesWithDifferentPrices {

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

}