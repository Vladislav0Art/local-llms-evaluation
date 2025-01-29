package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestCalculateSpans_Duplication {

    @Test
    public void testCalculateSpans_Duplication() {
        int price1 = 100, price2 = 120;
        int[] prices = new int[]{price1, price1};
        int[] result = OnlineStockSpan.calculateSpans(prices);
        assertEquals(3, result[0]);
    }

}