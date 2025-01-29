package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestNext_11 {

    @Test
    public void testNext_11() {
        mockPriceList = mock(List.class);
        mockPriceList.add(1);
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            prices.add(i);
        }
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result2 = stock.calculateSpans(prices);
        assertEquals(1, result2[0]);
    }

}