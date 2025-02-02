package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNext_SinglePrice_ReturnsOne {

    @Test
    public void next_SinglePrice_ReturnsOne() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(100);
        assertEquals(1, result);
    }

}