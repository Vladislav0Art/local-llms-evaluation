package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNext_DuplicatePrices {

    @Test
    public void next_DuplicatePrices() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        stockSpan.next(20);
        stockSpan.next(10);
        assertEquals(2, stockSpan.next(10));
    }

}