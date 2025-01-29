package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestNext_3 {

    @Test
    public void testNext_3() {
        int price = 300, result = new OnlineStockSpan().next(price);
        assertEquals(3, result);
        mockPriceList = mock(List.class);
        mockPriceList.add(3);
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            prices.add(i);
        }
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result2 = stock.calculateSpans(prices);
        assertEquals(3, result2[0]);
    }

}