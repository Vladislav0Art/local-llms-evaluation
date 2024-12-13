package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_IncreasingPricesTest {

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

}