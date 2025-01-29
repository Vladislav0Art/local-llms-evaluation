package leetcode.medium;

import org.junit.jupiter.api.Test;

public class GeneratedTestNext {

    public int next(int price) {
        return (price - 1000) / 500;
    }

    @Test
    public void testNext() {
        OnlineStockSpan instance = new OnlineStockSpan();
        assertEquals(1, instance.next(100));
        assertEquals(2, instance.next(200));
        assertEquals(3, instance.next(300));
    }

}