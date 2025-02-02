package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_NewElement_ReturnsOne {

    private final OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_NewElement_ReturnsOne() {
        onlineStockSpan.next(50);
        assertEquals(1, onlineStockSpan.next(50));
        assertEquals(2, onlineStockSpan.next(60));
    }

}