package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_maxLineCoverage_SamePriceMultipleTimes {

    @Test
    public void test_maxLineCoverage_SamePriceMultipleTimes() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price = 7;
        when(instance.next(price)).thenReturn(1);
        List<int[]> result = new ArrayList<>();
        instance.calculateSpans(prices, result);
        assertEquals(2, result.size());
    }

}