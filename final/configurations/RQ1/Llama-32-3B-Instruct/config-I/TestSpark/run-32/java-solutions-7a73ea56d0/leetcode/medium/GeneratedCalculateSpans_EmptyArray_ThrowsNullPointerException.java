package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_EmptyArray_ThrowsNullPointerException {

    @Test
    public void calculateSpans_EmptyArray_ThrowsNullPointerException() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertThrows(NullPointerException.class, () -> onlineStockSpan.calculateSpans(new int[0]));
    }

}