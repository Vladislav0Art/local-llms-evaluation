package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_IncreasingSequence_ReturnsIncreasingNumber {

    private final OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_IncreasingSequence_ReturnsIncreasingNumber() {
        for (int i = 0; i < 10; i++) {
            int price = (i * 100) - 50;
            onlineStockSpan.next(price);
        }
        assertEquals(10, onlineStockSpan.next((11 * 100) + 20));
    }

}