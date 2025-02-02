package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Arrays;

public class GeneratedCalculateSpans_EmptyArrayTest {

    public OnlineStockSpan underTest = new OnlineStockSpan();

    @Test
    public void calculateSpans_EmptyArrayTest() {
        int[] prices = {};
        int[] result = underTest.calculateSpans(prices);
        assertArrayEquals(new int[]{0}, result);
    }

}