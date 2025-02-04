package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Stack;

public class GeneratedNextPriceIsAddedAndGetCountCorrectlyWhenStackIsEmpty {

    @Test
    public void nextPriceIsAddedAndGetCountCorrectlyWhenStackIsEmpty() {
        OnlineStockSpan obj = new OnlineStockSpan();
        obj.next(10);
        assertEquals(1, obj.next(7));
    }

}