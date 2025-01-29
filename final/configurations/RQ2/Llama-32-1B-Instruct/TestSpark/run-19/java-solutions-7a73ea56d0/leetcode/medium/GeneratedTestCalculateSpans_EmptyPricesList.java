package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestCalculateSpans_EmptyPricesList {

    @Test
    public void testCalculateSpans_EmptyPricesList() {
        OnlineStockSpan instance = new OnlineStockSpan();
        when(instance.calculateSpans(new ArrayList<>())).thenReturn(new int[0]);
        // should return empty array if prices is empty
        List<Integer> prices = new ArrayList<>();
        assertArrayEquals(new int[]{}, instance.calculateSpans(prices));
    }

}