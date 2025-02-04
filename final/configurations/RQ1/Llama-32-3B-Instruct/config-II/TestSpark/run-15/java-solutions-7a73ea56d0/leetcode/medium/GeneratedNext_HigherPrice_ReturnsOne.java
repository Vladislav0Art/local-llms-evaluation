package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_HigherPrice_ReturnsOne {

    @Test
    public void next_HigherPrice_ReturnsOne() {
        OnlineStockSpan obj = new OnlineStockSpan();
        obj.list.add(100);
        int result = obj.next(100);
        assertEquals(1, result);
    }

}