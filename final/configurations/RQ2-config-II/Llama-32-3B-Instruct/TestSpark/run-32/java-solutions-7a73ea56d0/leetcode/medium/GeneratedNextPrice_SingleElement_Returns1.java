package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNextPrice_SingleElement_Returns1 {

    @Test
    public void nextPrice_SingleElement_Returns1() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(10);
        assertEquals(1, result);
    }

}