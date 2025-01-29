package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest_next_1 {

    @Test
    public void test_next_1() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(0, onlineStockSpan.next(100));
        assertEquals(-1, onlineStockSpan.next(50));
        assertEquals(-1, onlineStockSpan.next(2000));
    }

}