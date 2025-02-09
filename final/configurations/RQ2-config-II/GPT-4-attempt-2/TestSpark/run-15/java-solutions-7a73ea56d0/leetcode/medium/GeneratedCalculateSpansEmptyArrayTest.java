package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansEmptyArrayTest {

    @Test
    public void calculateSpansEmptyArrayTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        int[] spans = spanner.calculateSpans(new int[]{});
        assertArrayEquals(new int[]{}, spans);
    }

}