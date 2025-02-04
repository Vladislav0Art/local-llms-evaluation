package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Stack;

public class GeneratedNextPriceIsAddedAndGetCountCorrectly {

    @Test
    public void nextPriceIsAddedAndGetCountCorrectly() {
        OnlineStockSpan obj = new OnlineStockSpan();
        obj.next(10);
        obj.next(7);
        obj.next(5);
        assertEquals(2, obj.list.get(obj.list.size() - 1));
    }

}