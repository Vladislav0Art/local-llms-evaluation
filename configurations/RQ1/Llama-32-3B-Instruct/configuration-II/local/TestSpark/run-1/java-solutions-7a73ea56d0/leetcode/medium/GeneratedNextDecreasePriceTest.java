package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Arrays;

public class GeneratedNextDecreasePriceTest {

    @Test
    public void nextDecreasePriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(30);
        onlineStockSpan.next(20);
        onlineStockSpan.next(10);
        int result = onlineStockSpan.next(25);
        assertEquals(2, result);
        result = onlineStockSpan.next(15);
        assertEquals(3, result);
    }

}