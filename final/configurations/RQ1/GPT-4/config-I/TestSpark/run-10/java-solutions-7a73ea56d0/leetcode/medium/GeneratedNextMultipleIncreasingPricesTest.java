package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextMultipleIncreasingPricesTest {

    @Test
    public void nextMultipleIncreasingPricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        onlineStockSpan.next(200);
        assertEquals(1, onlineStockSpan.next(300));
    }

}