package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNextPriceSameValueNoSpan {

    @Test
    public void nextPriceSameValueNoSpan() {
        OnlineStockSpan s = new OnlineStockSpan();
        s.next(10);
        s.next(20);
        s.next(15);
        assertEquals(0, s.next(10));
    }

}