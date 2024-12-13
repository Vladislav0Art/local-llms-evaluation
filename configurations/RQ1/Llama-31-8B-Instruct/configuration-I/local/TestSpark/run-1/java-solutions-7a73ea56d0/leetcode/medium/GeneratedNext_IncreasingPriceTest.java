package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GeneratedNext_IncreasingPriceTest {

    @Test
    public void next_IncreasingPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30, 40, 50};
        for (int price : prices) {
            int expected = 1;
            int actual = stockSpan.next(price);
            assertEquals(expected, actual);
        }
    }

}