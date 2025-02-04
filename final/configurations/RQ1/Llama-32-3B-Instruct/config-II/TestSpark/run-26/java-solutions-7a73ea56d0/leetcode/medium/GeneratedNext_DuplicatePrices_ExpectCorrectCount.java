package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNext_DuplicatePrices_ExpectCorrectCount {

    @Test
    public void next_DuplicatePrices_ExpectCorrectCount() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(10);
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        assertEquals(3, onlineStockSpan.list.size());
    }

}