package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextTestWithDuplicates {

    @Test
    public void nextTestWithDuplicates() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(1));
        assertEquals(2, stockSpan.next(1));
        assertEquals(3, stockSpan.next(1));
    }

}