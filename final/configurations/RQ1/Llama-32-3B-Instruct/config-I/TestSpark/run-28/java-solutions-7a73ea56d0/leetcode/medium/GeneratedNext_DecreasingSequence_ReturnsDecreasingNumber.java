package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_DecreasingSequence_ReturnsDecreasingNumber {

    private final OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_DecreasingSequence_ReturnsDecreasingNumber() {
        for (int i = 0; i < 10; i++) {
            int price = (i * 100) - 50;
            onlineStockSpan.next(price);
        }
        assertEquals(1, onlineStockSpan.next((9 * 100) + 80));
    }

}