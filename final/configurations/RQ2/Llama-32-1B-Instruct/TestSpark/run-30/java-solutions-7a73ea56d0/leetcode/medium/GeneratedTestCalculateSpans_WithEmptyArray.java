package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestCalculateSpans_WithEmptyArray {

    @Test
    public void testCalculateSpans_WithEmptyArray() {
        List<Integer> prices = new ArrayList<>();
        int[] result = OnlineStockSpan.calculateSpans(prices);
        assertNotNull(result);
        assertEquals(0, result[0]);
        for (int i = 1; i < result.length; i++) {
            assertEquals(i - 1, result[i]);
        }
    }

}