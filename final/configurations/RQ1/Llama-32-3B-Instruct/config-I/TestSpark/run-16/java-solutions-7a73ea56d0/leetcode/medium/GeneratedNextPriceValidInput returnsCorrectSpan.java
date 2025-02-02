package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNextPriceValidInput returnsCorrectSpan {

    @Test
    public void nextPriceValidInput

    returnsCorrectSpan() {
        OnlineStockSpan s = new OnlineStockSpan();
        s.next(100);
        s.next(80);
        assertEquals(1, s.next(70));
    }

}