package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import leetcode.medium.OnlineStockSpan;

public class GeneratedNextTest {

    @Test
    public void nextTest() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int price = 100;
        int result = stock.next(price);
        assertEquals(1, result);
    }

}