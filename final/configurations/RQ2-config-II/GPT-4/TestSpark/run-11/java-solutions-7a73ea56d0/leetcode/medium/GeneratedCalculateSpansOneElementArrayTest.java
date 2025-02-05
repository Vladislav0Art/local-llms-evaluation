package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansOneElementArrayTest {

    @Test
    public void calculateSpansOneElementArrayTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] oneElementArray = new int[]{10};
        int[] spans = onlineStockSpan.calculateSpans(oneElementArray);
        assertArrayEquals(new int[]{1}, spans);
    }

}