package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedCalculateSpans_MultiplePricesTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_MultiplePricesTest() {
        int[] prices = {100, 80, 75, 70, 60, 55, 50, 45, 40, 35};
        int[] result = onlineStockSpan.calculateSpans(prices);

        assertArrayEquals(new int[]{1, 2, 4, 6, 8, 10, 12, 14, 16, 18}, result);
    }

}