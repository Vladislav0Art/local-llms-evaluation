package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest_next_2 {

    @Test
    public void test_next_2() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(100));
        assertEquals(-1, onlineStockSpan.next(50));
        assertEquals(1, onlineStockSpan.next(2000));
    }

}