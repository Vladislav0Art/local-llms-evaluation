package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class GeneratedCalculateSpansTest {

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30};
        int[] spans = stockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{0, 1, 1}, spans);
    }

}