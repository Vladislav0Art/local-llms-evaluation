package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_maxLineCoverage_ExistingPrice {

    @Test
    public void test_maxLineCoverage_ExistingPrice() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price = 7;
        when(instance.next(price)).thenReturn(1);
        List<int[]> result = new ArrayList<>();
        instance.calculateSpans(prices, result);
        assertEquals(1, result.size());
    }

}