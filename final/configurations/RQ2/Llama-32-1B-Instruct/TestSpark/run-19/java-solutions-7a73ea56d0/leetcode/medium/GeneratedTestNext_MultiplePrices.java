package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestNext_MultiplePrices {

    @Test
    public void testNext_MultiplePrices() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price1 = 2;
        int price2 = 3;
        List<Integer> prices = new ArrayList<>();
        prices.add(price1);
        prices.add(price2);
        instance.next(price1);
        instance.next(price2);
        when(instance.next(price1)).thenReturn(0);
        when(instance.next(price2)).thenReturn(0);
        int[] actualSpans = instance.calculateSpans(prices);
        assertArrayEquals(new int[]{price1, price2}, actualSpans);
    }

}