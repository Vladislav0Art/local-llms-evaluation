package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_MockStack_ReturnsCorrectCount {

    private final OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_MockStack_ReturnsCorrectCount() throws Exception {
        Stack<Integer> mockStack = new Stack<>();
        mockStack.push(10);
        assertEquals((Integer) 1, onlineStockSpan.next(-100, mockStack));
    }

}