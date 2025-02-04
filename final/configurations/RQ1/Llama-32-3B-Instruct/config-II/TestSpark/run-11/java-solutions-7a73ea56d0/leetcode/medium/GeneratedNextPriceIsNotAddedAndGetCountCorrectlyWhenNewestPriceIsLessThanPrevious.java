package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Stack;

public class GeneratedNextPriceIsNotAddedAndGetCountCorrectlyWhenNewestPriceIsLessThanPrevious {

    @Test
    public void nextPriceIsNotAddedAndGetCountCorrectlyWhenNewestPriceIsLessThanPrevious() {
        OnlineStockSpan obj = new OnlineStockSpan();
        obj.next(10);
        obj.next(9);
        assertEquals(2, obj.next(7));
    }

}