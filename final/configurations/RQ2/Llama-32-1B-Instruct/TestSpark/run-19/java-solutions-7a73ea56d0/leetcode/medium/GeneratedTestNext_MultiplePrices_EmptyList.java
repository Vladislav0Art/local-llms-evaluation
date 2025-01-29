package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestNext_MultiplePrices_EmptyList {

    @Test
    public void testNext_MultiplePrices_EmptyList() {
        OnlineStockSpan instance = new OnlineStockSpan();
        List<Integer> prices = new ArrayList<>();
        when(instance.next(1)).thenReturn(0);
        when(instance.next(1)).thenReturn(0); // to make it not call next twice
        int[] actualSpans = instance.calculateSpans(prices);
        assertArrayEquals(new int[]{}, actualSpans);
    }

}