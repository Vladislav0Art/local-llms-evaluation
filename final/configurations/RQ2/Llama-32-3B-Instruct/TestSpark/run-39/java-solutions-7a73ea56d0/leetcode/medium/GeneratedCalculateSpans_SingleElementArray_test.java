package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedCalculateSpans_SingleElementArray_test {

    @Test
    public void calculateSpans_SingleElementArray_test() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{10});
        assertEquals(1, Arrays.stream(result).max().getAsInt());
    }

}