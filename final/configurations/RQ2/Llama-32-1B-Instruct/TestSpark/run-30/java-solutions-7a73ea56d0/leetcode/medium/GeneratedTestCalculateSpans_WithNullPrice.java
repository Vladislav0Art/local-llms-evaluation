package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestCalculateSpans_WithNullPrice {

    @Test
    public void testCalculateSpans_WithNullPrice() {
        int price = null;
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result = stock.calculateSpans(new ArrayList<>());
        assertNotNull(result);
    }

}