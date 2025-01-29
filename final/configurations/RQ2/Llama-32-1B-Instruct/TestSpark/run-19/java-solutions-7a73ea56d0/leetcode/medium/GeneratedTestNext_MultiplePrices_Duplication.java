package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestNext_MultiplePrices_Duplication {

    @Test
    public void testNext_MultiplePrices_Duplication() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price = 1;
        List<Integer> prices = new ArrayList<>();
        prices.add(price);
        instance.next(price);
        when(instance.next(price)).thenReturn(2);
        prices.clear();
        instance.next(price);
        instance.next(price);
        when(instance.next(price)).thenReturn(3);
        when(instance.next(price)).thenReturn(0); // to make it not call next twice
        int[] actualSpans = instance.calculateSpans(prices);
        assertArrayEquals(new int[]{2, 1}, actualSpans);
    }

}