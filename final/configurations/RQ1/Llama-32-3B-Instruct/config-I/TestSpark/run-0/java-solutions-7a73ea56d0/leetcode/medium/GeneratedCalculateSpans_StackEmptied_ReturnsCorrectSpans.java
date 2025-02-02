package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpans_StackEmptied_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_StackEmptied_ReturnsCorrectSpans() {
        OnlineStockSpan stock = new OnlineStockSpan();
        for (int i = 0; i < 10; i++) {
            stock.next(i);
        }
        int[] result = stock.calculateSpans(new int[]{});
        assertArrayEquals(new int[0], result);
    }

}