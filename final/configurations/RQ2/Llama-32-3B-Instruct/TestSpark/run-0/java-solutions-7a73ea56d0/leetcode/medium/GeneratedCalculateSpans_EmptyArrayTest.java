package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class GeneratedCalculateSpans_EmptyArrayTest {

    @Test
    public void calculateSpans_EmptyArrayTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[0]);
        assertArrayEquals(new int[0], result);
    }

}