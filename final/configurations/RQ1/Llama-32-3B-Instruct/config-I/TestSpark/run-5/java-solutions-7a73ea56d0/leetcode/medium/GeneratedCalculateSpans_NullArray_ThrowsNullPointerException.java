package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedCalculateSpans_NullArray_ThrowsNullPointerException {

    @Test
    public void calculateSpans_NullArray_ThrowsNullPointerException() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

        try {
            onlineStockSpan.calculateSpans(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

}