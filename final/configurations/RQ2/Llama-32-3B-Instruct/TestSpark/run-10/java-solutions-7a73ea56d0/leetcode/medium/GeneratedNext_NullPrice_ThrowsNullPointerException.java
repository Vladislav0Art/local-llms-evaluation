package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedNext_NullPrice_ThrowsNullPointerException {

    @Test
    public void next_NullPrice_ThrowsNullPointerException() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertThrows(NullPointerException.class, () -> stockSpan.next(null));
    }
}

public class StockSpanCalculator {

    public int next(int price) {
        // implementation...
    }

    public int[] calculateSpans(int[] prices) {
        // implementation...
    }

}