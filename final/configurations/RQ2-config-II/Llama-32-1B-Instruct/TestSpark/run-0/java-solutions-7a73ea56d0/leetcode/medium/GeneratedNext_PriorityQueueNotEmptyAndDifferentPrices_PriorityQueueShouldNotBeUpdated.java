package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class GeneratedNext_PriorityQueueNotEmptyAndDifferentPrices_PriorityQueueShouldNotBeUpdated {

    private OnlineStockSpan instance = new OnlineStockSpan();

    @Test
    public void next_PriorityQueueNotEmptyAndDifferentPrices_PriorityQueueShouldNotBeUpdated() {
        List<Integer> prices = new ArrayList<>();
        Mockito.when(instance.next(Mockito.anyInt())).thenReturn(-1);
        int[] result = instance.calculateSpans(prices.toArray(new Integer[0]));
        assertEquals(2, result.length); // max coverage of line: price - first price + current index
    }

}