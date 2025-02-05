package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class GeneratedNextExistingPriceTest {

    @Test
    public void nextExistingPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(50));
        assertEquals(2, onlineStockSpan.next(60));
        assertEquals(3, onlineStockSpan.next(70));
        assertEquals(4, onlineStockSpan.next(80));
        assertEquals(1, onlineStockSpan.next(60));
    }

}