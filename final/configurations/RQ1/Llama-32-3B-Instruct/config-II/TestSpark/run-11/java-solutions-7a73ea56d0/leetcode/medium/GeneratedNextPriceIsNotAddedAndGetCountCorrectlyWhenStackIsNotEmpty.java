package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Stack;

public class GeneratedNextPriceIsNotAddedAndGetCountCorrectlyWhenStackIsNotEmpty {

    @Test
    public void nextPriceIsNotAddedAndGetCountCorrectlyWhenStackIsNotEmpty() {
        Stack<Integer> stack = new Stack<>();
        OnlineStockSpan obj = new OnlineStockSpan();
        obj.next(10);
        obj.next(9);
        assertEquals(1, obj.next(7));
    }

}