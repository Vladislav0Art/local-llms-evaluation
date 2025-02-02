package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedCalculateSpans_SinglePriceTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_SinglePriceTest() {
        int[] prices = {10};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1}, result);
    }

}