package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedCalculateSpans_MultipleElementsArray_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_MultipleElementsArray_ReturnsCorrectSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        when("prices").thenReturn(new int[]{3, 10, -5, 9, 20});
        int[] result = onlineStockSpan.calculateSpans(new int[]{3, 10, -5, 9, 20});
        assertArrayEquals(result, new int[]{1, 2, 4, 2, 5});
    }

}