package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextNormalFlowTest {

    @Test
    public void nextNormalFlowTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(56);
        onlineStockSpan.next(50);
        int result = onlineStockSpan.next(60);
        assertEquals(3, result);
    }

}