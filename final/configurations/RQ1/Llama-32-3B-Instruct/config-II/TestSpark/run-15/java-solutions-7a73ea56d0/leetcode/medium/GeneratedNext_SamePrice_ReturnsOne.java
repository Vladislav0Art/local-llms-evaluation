package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_SamePrice_ReturnsOne {

    @Test
    public void next_SamePrice_ReturnsOne() {
        OnlineStockSpan obj = new OnlineStockSpan();
        int result = obj.next(100);
        assertEquals(1, result);
    }

}