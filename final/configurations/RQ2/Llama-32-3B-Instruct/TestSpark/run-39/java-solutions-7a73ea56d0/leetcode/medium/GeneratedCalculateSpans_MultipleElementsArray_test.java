package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedCalculateSpans_MultipleElementsArray_test {

    @Test
    public void calculateSpans_MultipleElementsArray_test() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{15, 3, -10});
        assertEquals(2, Arrays.stream(result).max().getAsInt());
    }

}