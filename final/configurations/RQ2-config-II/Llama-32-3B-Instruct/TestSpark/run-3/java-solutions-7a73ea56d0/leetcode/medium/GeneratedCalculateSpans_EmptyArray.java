package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class GeneratedCalculateSpans_EmptyArray {

    @Test
    public void calculateSpans_EmptyArray() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{});
        assertEquals(0, Arrays.stream(result).sum());
    }

}