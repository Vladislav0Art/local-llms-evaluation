package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_DivisibleByZero_ThrowsException {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_DivisibleByZero_ThrowsException() {
        assertThrows(Exception.class, () -> onlineStockSpan.next(0));
    }

}