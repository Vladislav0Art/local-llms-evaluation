package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNext_ZeroPrice_ReturnsZero {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_ZeroPrice_ReturnsZero() {
        assertEquals(0, onlineStockSpan.next(0));
    }

}