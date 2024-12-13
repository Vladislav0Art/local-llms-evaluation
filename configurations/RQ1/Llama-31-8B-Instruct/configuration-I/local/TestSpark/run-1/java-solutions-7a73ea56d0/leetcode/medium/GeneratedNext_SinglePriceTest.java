package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GeneratedNext_SinglePriceTest {

    @Test
    public void next_SinglePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int price = 10;
        int expected = 1;
        int actual = stockSpan.next(price);
        assertEquals(expected, actual);
    }

}