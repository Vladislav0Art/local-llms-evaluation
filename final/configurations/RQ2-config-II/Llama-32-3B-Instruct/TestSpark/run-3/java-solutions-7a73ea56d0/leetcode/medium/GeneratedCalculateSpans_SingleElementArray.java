package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class GeneratedCalculateSpans_SingleElementArray {

    @Test
    public void calculateSpans_SingleElementArray() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{10});
        assertEquals(1, Arrays.stream(result).sum());
    }

}