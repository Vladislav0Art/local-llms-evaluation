package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class GeneratedNextPriceMultipleIncreaseThenDecreaseTest {

    @Test
    public void nextPriceMultipleIncreaseThenDecreaseTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {3, 2, 1};
        for (int price : prices) {
            int result = onlineStockSpan.next(price);
            assertTrue(result > 0);
        }
    }

}