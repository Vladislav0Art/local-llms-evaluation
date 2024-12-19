package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNext_NegativePrice_ReturnsOne {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_NegativePrice_ReturnsOne() {
        assertEquals(1, onlineStockSpan.next(-1));
    }

}