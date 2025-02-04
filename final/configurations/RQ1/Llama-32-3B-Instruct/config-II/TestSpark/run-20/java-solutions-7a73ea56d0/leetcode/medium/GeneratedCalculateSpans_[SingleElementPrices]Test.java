package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_[SingleElementPrices]

Test {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_[ SingleElementPrices]Test() {
        int[] prices = {100};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(new int[]{1}, result);
    }

}