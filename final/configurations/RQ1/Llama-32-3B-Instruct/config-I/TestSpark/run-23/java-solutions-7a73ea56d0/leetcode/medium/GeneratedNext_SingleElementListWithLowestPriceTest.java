package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNext_SingleElementListWithLowestPriceTest {

    private final OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void next_SingleElementListWithLowestPriceTest() {
        int price = -1;
        stockSpan.list.clear();
        stockSpan.next(price);
        assertEquals(1, stockSpan.list.size());
        assertEquals(-1, stockSpan.next(price));
    }

}