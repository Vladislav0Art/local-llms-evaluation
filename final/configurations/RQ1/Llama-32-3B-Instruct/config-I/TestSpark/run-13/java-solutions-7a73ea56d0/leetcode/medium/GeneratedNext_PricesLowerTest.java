package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Arrays;

public class GeneratedNext_PricesLowerTest {

    public OnlineStockSpan underTest = new OnlineStockSpan();

    @Test
    public void next_PricesLowerTest() {
        int[] prices = {20, 15};
        assertEquals(0, underTest.next(10));
        assertEquals(1, underTest.next(5));
    }

}