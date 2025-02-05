package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansEmptyArrayTest {

    @Test
    public void calculateSpansEmptyArrayTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(0, onlineStockSpan.calculateSpans(new int[]{}).length);
    }

}