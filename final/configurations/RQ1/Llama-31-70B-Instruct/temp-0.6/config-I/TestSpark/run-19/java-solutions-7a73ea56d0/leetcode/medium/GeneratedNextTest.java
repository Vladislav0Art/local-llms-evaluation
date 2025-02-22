package leetcode.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedNextTest {

    private OnlineStockSpan onlineStockSpan;

    @BeforeEach
    public void setUp() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void nextTest() {
        assertEquals(0, onlineStockSpan.next(5));
        assertEquals(1, onlineStockSpan.next(10));
        assertEquals(0, onlineStockSpan.next(5));
        assertEquals(1, onlineStockSpan.next(10));
    }

}