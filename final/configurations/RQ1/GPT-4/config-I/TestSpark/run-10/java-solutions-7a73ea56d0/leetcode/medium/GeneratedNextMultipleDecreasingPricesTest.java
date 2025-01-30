package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextMultipleDecreasingPricesTest {

    @Test
    public void nextMultipleDecreasingPricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(300);
        onlineStockSpan.next(200);
        assertEquals(3, onlineStockSpan.next(100));
    }

}