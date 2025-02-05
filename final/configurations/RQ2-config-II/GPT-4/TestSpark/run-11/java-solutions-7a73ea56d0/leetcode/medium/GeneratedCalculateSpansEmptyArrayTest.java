package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansEmptyArrayTest {

    @Test
    public void calculateSpansEmptyArrayTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] emptyArray = new int[0];
        int[] spans = onlineStockSpan.calculateSpans(emptyArray);
        assertArrayEquals(emptyArray, spans);
    }

}