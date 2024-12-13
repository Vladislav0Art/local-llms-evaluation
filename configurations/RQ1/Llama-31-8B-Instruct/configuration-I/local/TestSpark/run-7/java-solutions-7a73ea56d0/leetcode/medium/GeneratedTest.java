package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class GeneratedTest {

    @Test
    public void next_SinglePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        assertEquals(1, stockSpan.list.size());
        assertEquals(10, (int) stockSpan.list.get(0));
        assertEquals(1, stockSpan.next(10));
    }

    @Test
    public void next_IncreasingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        stockSpan.next(20);
        stockSpan.next(30);
        assertEquals(3, stockSpan.list.size());
        assertEquals(10, (int) stockSpan.list.get(0));
        assertEquals(20, (int) stockSpan.list.get(1));
        assertEquals(30, (int) stockSpan.list.get(2));
        assertEquals(1, stockSpan.next(10));
        assertEquals(2, stockSpan.next(20));
        assertEquals(3, stockSpan.next(30));
    }

    @Test
    public void next_DecreasingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(30);
        stockSpan.next(20);
        stockSpan.next(10);
        assertEquals(3, stockSpan.list.size());
        assertEquals(30, (int) stockSpan.list.get(0));
        assertEquals(20, (int) stockSpan.list.get(1));
        assertEquals(10, (int) stockSpan.list.get(2));
        assertEquals(3, stockSpan.next(30));
        assertEquals(2, stockSpan.next(20));
        assertEquals(1, stockSpan.next(10));
    }

}