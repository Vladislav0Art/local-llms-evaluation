package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class GeneratedNext_DuplicatePrice {

    @Test
    public void next_DuplicatePrice() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.calculateSpans(new int[]{10, 7, 5, 8, 11, 9});
        assertEquals(1, onlineStockSpan.next(10));
    }

}