package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_NullPriceThrowsException {

    private OnlineStockSpan solution = new OnlineStockSpan();

    @Test
    public void next_NullPriceThrowsException() {
        assertThrows(NullPointerException.class, () -> solution.next(null));
    }

}