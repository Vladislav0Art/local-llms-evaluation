package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNext_DifferentPrice_ExpectTwo {

    @Test
    public void next_DifferentPrice_ExpectTwo() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        assertEquals(2, onlineStockSpan.list.size());
    }

}