package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import leetcode.medium.OnlineStockSpan;

public class GeneratedCalculateSpansSingleElementTest {

    @Test
    public void calculateSpansSingleElementTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{10});
        assertArrayEquals(new int[]{1}, result);
    }

}