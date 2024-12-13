package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitCore.class)
public class GeneratedNext_DecreasingPricesTest {

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