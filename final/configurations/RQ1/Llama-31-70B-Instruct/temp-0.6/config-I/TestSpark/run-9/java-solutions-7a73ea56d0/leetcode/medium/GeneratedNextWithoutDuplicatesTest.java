package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import leetcode.medium.OnlineStockSpan;

public class GeneratedNextWithoutDuplicatesTest {

    @Test
    public void nextWithoutDuplicatesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        stockSpan.next(20);
        stockSpan.next(30);
        int result = stockSpan.next(40);
        assertEquals(4, result);
    }

}