package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_[greaterThanPreviousPrice]

Test {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void next_[ greaterThanPreviousPrice]Test() {
        int price = 5;
        int previousPrice = 3;
        int expected = 2;
        assertEquals(expected, stockSpan.next(price));
    }

}