package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedNext_EmptyList_PriceEqualsZero_ReturnsZero {

    private List<Integer> list = new ArrayList<>();

    public OnlineStockSpan getOnlineStockSpan() {
        return new OnlineStockSpan();
    }

    public int[] calculateSpans(int[] prices) {
        return getOnlineStockSpan().calculateSpans(prices);
    }

    @Test
    public void next_EmptyList_PriceEqualsZero_ReturnsZero() {
        when(list.size()).thenReturn(0);
        when(list.isEmpty()).thenReturn(true);
        when(list.get(0)).thenReturn(0);
        when(list.get(-1)).thenReturn(0);
        int result = getOnlineStockSpan().next(0);
        assertEquals(0, result);
    }

}