package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_NullPricesThrowException {

    private OnlineStockSpan solution = new OnlineStockSpan();

    @Test
    public void calculateSpans_NullPricesThrowException() {
        int[] nullArray = new int[0];
        assertThrows(NullPointerException.class, () -> solution.calculateSpans(nullArray));
    }

}