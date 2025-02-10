package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.*;

import java.util.ArrayList;

public class GeneratedTestCalculateSpansWithMultiplePricesAndIndexStackEmptyTest {

    @Test
    public void testCalculateSpansWithMultiplePricesAndIndexStackEmptyTest() throws Exception {
        int[] prices = {1, 7, 6, 9};
        OnlineStockSpan.OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.list.clear();

        for (int i : prices) {
            onlineStockSpan.next(i);
        }

        // Push the index of first element
        onlineStockSpan.list.add(0);

        int[] expectedSpans = {2, 3};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);

        assertEquals(expectedSpans.length, actualSpans.length);
        for (int i = 0; i < expectedSpans.length; i++) {
            assertEquals(expectedSpans[i], actualSpans[i]);
        }
    }

}