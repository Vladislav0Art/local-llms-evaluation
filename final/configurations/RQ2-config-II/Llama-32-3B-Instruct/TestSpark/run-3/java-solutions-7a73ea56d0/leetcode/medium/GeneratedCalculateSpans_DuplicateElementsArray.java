package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class GeneratedCalculateSpans_DuplicateElementsArray {

    @Test
    public void calculateSpans_DuplicateElementsArray() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{10, 7, 5, 8, 11, 9});
        assertEquals(36, Arrays.stream(result).sum());
    }

}