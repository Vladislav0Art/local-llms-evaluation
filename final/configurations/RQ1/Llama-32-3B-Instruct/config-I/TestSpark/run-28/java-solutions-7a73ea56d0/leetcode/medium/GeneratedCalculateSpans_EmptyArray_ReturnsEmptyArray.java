package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_EmptyArray_ReturnsEmptyArray {

    private final OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        assertArrayEquals(new int[0], onlineStockSpan.calculateSpans(new int[0]));
    }

}