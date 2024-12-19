package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNext_PositivePrice_ReturnsPositiveNumber {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_PositivePrice_ReturnsPositiveNumber() {
        assertEquals(2, onlineStockSpan.next(3));
    }

}