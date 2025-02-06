package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansEmptyArray_ThrowsNullPointerException {

    @Test
    public void calculateSpansEmptyArray_ThrowsNullPointerException() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        try {
            onlineStockSpan.calculateSpans(new int[0]);
            assert false;
        } catch (NullPointerException e) {
            assertEquals(1, e.getMessage().indexOf(" prices"));
        }
    }

}