package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNext_Price_SameAsPreviousPrice_ReturnsCorrectSpan {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void next_Price_SameAsPreviousPrice_ReturnsCorrectSpan() {
        stockSpan.list.add(10);
        stockSpan.list.add(10);
        stockSpan.list.add(10);
        assertEquals(1, stockSpan.next(10));
    }

}