package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextDecreasingPricesTest {

    @Test
    public void nextDecreasingPricesTest() {
        OnlineStockSpan oss = new OnlineStockSpan();
        oss.next(130);
        oss.next(120);
        int result = oss.next(100);
        assertEquals(1, result);
    }

}