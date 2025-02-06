package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpans_SinglePrice_ReturnsOneElementArrayWithOneElement {

    @Test
    public void calculateSpans_SinglePrice_ReturnsOneElementArrayWithOneElement() {
        OnlineStockSpan s = new OnlineStockSpan();
        int[] result = s.calculateSpans(new int[]{100});
        assertEquals(new int[]{1}, result);
    }

}