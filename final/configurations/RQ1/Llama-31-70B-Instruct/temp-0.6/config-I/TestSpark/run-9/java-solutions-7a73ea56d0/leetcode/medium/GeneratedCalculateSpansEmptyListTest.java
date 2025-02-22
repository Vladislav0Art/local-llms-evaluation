package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import leetcode.medium.OnlineStockSpan;

public class GeneratedCalculateSpansEmptyListTest {

    @Test
    public void calculateSpansEmptyListTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[0]);
        assertArrayEquals(new int[0], result);
    }

}