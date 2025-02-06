package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class GeneratedNextPriceMultipleTest {

    @Test
    public void nextPriceMultipleTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {-1, -0, 0};
        for (int price : prices) {
            int result = onlineStockSpan.next(price);
            assertTrue(result > 0);
        }
    }

}