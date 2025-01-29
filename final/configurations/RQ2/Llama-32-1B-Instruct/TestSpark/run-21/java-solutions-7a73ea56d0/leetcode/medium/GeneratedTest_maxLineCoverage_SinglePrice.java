package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_maxLineCoverage_SinglePrice {

    @Test
    public void test_maxLineCoverage_SinglePrice() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price = 2;
        when(instance.next(price)).thenReturn(1);
        List<int[]> result = new ArrayList<>();
        instance.calculateSpans(prices, result);
        assertEquals(0, result.size());
    }

}