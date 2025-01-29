package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestNext_10 {

    @Test
    public void testNext_10() {
        int price = 1000;
        mockPriceList = mock(List.class);
        mockPriceList.add(price);
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            prices.add(i);
        }
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result2 = stock.calculateSpans(prices);
        assertEquals(price, result2[0]);
    }

}