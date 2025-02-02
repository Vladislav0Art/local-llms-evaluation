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
public class GeneratedNext_NonEmptyList_PriceIsGreaterThanZerothElement_ReturnsCount {

    private List<Integer> list = new ArrayList<>();

    public OnlineStockSpan getOnlineStockSpan() {
        return new OnlineStockSpan();
    }

    public int[] calculateSpans(int[] prices) {
        return getOnlineStockSpan().calculateSpans(prices);
    }

    @Test
    public void next_NonEmptyList_PriceIsGreaterThanZerothElement_ReturnsCount() {
        when(list.size()).thenReturn(5);
        list.add(-5);
        list.add(-2);
        list.add(-3);
        list.add(-4);
        list.add(-1);
        when(list.get(0)).thenReturn(-5);
        int result = getOnlineStockSpan().next(-1);
        assertEquals(1, result);
    }

}