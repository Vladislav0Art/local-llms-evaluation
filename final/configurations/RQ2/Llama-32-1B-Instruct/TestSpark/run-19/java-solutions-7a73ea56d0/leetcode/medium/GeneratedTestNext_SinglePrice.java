package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestNext_SinglePrice {

    @Test
    public void testNext_SinglePrice() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price = 1;
        int[] prices = {1};
        int[] expectedSpans = {0};
        when(instance.next(price)).thenReturn(1);
        int actualSpans = instance.calculateSpans(prices);
        assertEquals(expectedSpans[0], actualSpans);
    }

}