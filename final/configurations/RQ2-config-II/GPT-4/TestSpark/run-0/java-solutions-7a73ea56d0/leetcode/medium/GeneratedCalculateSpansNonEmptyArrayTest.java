package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansNonEmptyArrayTest {

    @Test
    public void calculateSpansNonEmptyArrayTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] input = {100, 80, 60, 70, 60, 75, 85};
        int[] result = stockSpan.calculateSpans(input);
        assertArrayEquals(new int[]{1, 1, 1, 2, 1, 4, 6}, result);
    }

}