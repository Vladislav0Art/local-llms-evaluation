package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestNext_5 {

    @Test
    public void testNext_5() {
        int price = 500, result = new OnlineStockSpan().next(price);
        assertEquals(5, result);
        mockPriceList = mock(List.class);
        mockPriceList.add(5);
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            prices.add(i);
        }
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result2 = stock.calculateSpans(prices);
        assertEquals(5, result2[0]);
    }

}