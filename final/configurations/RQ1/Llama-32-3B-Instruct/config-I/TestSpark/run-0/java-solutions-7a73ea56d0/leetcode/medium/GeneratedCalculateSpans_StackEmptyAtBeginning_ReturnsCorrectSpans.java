package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpans_StackEmptyAtBeginning_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_StackEmptyAtBeginning_ReturnsCorrectSpans() {
        OnlineStockSpan stock = new OnlineStockSpan();
        for (int i = 10; i >= 1; i--) {
            stock.next(i);
        }
        int[] result = stock.calculateSpans(new int[]{});
        assertArrayEquals(new int[]{10}, result);
    }

}