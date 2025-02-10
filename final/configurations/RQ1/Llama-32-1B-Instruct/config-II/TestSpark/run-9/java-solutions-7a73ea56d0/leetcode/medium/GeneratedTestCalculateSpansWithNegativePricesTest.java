package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.*;

import java.util.ArrayList;

public class GeneratedTestCalculateSpansWithNegativePricesTest {

    @Test
    public void testCalculateSpansWithNegativePricesTest() throws Exception {
        int[] prices = {-10, -20, -30};
        OnlineStockSpan.OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.list.clear();

        for (int i : prices) {
            onlineStockSpan.next(i);
        }

        // Push the index of first element
        onlineStockSpan.list.add(0);

        int[] expectedSpans = {1, 2};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);

        assertEquals(expectedSpans.length, actualSpans.length);
        for (int i = 0; i < expectedSpans.length; i++) {
            assertEquals(expectedSpans[i], actualSpans[i]);
        }
    }

}