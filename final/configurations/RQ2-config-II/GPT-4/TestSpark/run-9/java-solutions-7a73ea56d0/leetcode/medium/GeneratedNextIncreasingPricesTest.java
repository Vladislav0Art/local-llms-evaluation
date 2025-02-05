package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextIncreasingPricesTest {

    @Test
    public void nextIncreasingPricesTest() {
        OnlineStockSpan oss = new OnlineStockSpan();
        oss.next(100);
        oss.next(120);
        int result = oss.next(130);
        assertEquals(3, result);
    }

}