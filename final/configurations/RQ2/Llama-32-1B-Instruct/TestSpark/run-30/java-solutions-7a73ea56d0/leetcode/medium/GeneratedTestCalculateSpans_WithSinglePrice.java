package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestCalculateSpans_WithSinglePrice {

    @Test
    public void testCalculateSpans_WithSinglePrice() {
        int price = 100;
        int[] result = OnlineStockSpan.calculateSpans(new ArrayList<>());
        assertNotNull(result);
        assertEquals(1, result[0]);
    }

}