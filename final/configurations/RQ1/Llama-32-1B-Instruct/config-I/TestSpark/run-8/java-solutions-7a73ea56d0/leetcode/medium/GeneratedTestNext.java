package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestNext {

    @Test
    public void testNext() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(100));
        assertEquals(2, onlineStockSpan.next(120));
        assertEquals(3, onlineStockSpan.next(130));
        assertEquals(4, onlineStockSpan.next(150));
        assertEquals(5, onlineStockSpan.next(160));
        assertEquals(6, onlineStockSpan.next(170));
    }

}