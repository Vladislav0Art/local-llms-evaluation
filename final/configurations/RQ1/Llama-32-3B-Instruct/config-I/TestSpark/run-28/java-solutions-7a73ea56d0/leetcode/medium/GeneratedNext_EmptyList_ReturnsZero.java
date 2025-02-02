package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_EmptyList_ReturnsZero {

    private final OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_EmptyList_ReturnsZero() {
        assertEquals(0, onlineStockSpan.next(-100));
    }

}