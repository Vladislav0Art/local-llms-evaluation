package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import leetcode.medium.OnlineStockSpan;

public class GeneratedNextWithDuplicatesTest {

    @Test
    public void nextWithDuplicatesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        stockSpan.next(10);
        stockSpan.next(10);
        int result = stockSpan.next(10);
        assertEquals(4, result);
    }

}