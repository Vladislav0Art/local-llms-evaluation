package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextMultipleEqualPricesTest {

    @Test
    public void nextMultipleEqualPricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        onlineStockSpan.next(100);
        assertEquals(2, onlineStockSpan.next(100));
    }

}