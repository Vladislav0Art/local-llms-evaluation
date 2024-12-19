package leetcode.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNext_DifferentPositivePrices_ReturnsDifferentIntegers {

    @Before
    public void setup() {
        // Do nothing as per the requirements
    }

    @Test
    public void next_DifferentPositivePrices_ReturnsDifferentIntegers() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30, 40};
        for (int price : prices) {
            assertEquals(price + 1, onlineStockSpan.next(price));
        }
    }

}