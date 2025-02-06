package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansSingleElementArray_ReturnsOne {

    @Test
    public void calculateSpansSingleElementArray_ReturnsOne() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        try {
            int[] result = onlineStockSpan.calculateSpans(new int[]{10});
            assert result != null;
            assertEquals(1, result.length);
            assertEquals(1, result[0]);
        } catch (NullPointerException e) {
            fail("Expected exception not thrown");
        }
    }

}