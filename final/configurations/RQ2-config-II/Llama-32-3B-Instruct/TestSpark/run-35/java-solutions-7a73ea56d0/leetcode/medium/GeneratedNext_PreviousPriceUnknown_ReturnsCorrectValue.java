package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedNext_PreviousPriceUnknown_ReturnsCorrectValue {

    @Test
    public void next_PreviousPriceUnknown_ReturnsCorrectValue() {
        int price = 10;
        OnlineStockSpan stockSpan = new OnlineStackSpan();
        int result = stockSpan.next(price);
        assertEquals(1, result);
    }

    private static class OnlineStackSpan extends OnlineStockSpan {

        @Override
        public List<Integer> calculateSpans(int[] prices) {
            // implementation using Stack
            return null;
        }
    }

}