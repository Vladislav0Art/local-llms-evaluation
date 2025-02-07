package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestMaxLineCoverage_1 {

    @Test
    public void testMaxLineCoverage_1() {
        OnlineStockSpan stock = new OnlineStockSpan();
        when(stock.next(10)).thenReturn(2);
        int result = stock.calculateSpans(new int[]{10, 20, 30});
        assertEquals(3, result[0]);
        assertEquals(4, result[1]);
    }

}