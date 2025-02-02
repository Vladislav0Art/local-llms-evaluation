package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Arrays;

public class GeneratedNext_PricesGreaterTest {

    public OnlineStockSpan underTest = new OnlineStockSpan();

    @Test
    public void next_PricesGreaterTest() {
        int[] prices = {100, 80, 75, 60};
        assertEquals(1, underTest.next(100));
        assertEquals(2, underTest.next(80));
        assertEquals(3, underTest.next(75));
        assertEquals(4, underTest.next(60));
    }

}