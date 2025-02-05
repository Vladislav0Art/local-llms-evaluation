package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextMultiplePricesTest {

    @Test
    public void nextMultiplePricesTest() {
        OnlineStockSpan oss = new OnlineStockSpan();
        oss.next(100);
        int result = oss.next(80);
        assertEquals(1, result);
    }

}