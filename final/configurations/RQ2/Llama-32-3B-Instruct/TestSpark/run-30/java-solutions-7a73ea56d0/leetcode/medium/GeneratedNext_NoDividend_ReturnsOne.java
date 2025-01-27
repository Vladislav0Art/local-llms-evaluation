package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_NoDividend_ReturnsOne {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_NoDividend_ReturnsOne() {
        int price = 1;
        assertEquals(1, onlineStockSpan.next(price));
    }

}