package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Arrays;

public class GeneratedNextIncreasePriceTest {

    @Test
    public void nextIncreasePriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        onlineStockSpan.next(30);
        int result = onlineStockSpan.next(10);
        assertEquals(1, result);
        result = onlineStockSpan.next(15);
        assertEquals(2, result);
    }

}