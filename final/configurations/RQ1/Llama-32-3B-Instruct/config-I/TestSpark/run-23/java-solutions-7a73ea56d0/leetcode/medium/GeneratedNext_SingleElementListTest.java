package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNext_SingleElementListTest {

    private final OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void next_SingleElementListTest() {
        int price = 10;
        stockSpan.list.clear();
        stockSpan.next(price);
        assertEquals(1, stockSpan.list.size());
        assertEquals(0, stockSpan.next(price));
    }

}