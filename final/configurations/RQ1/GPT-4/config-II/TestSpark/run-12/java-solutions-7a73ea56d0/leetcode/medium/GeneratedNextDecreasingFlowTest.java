package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextDecreasingFlowTest {

    @Test
    public void nextDecreasingFlowTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(58);
        onlineStockSpan.next(56);
        int result = onlineStockSpan.next(50);
        assertEquals(1, result);
    }

}