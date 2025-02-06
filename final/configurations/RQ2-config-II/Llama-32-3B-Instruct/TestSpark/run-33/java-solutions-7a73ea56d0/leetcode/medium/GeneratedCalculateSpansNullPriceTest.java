package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Stack;

public class GeneratedCalculateSpansNullPriceTest {

    @Test
    public void calculateSpansNullPriceTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int price = null;
        try {
            solution.next(price);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

}