package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestCalculateSpans_SinglePrice {

    @Test
    public void testCalculateSpans_SinglePrice() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price = 1;
        when(instance.next(price)).thenReturn(0);
        when(instance.calculateSpans(new ArrayList<>(List.of(price)))).thenReturn(new int[]{price});
        assertArrayEquals(new int[]{}, instance.calculateSpans(prices));
    }

}