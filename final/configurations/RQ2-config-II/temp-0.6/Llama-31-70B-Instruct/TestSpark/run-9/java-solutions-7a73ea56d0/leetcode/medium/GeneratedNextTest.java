package leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextTest {

    @Test
    public void nextTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(10));
        assertEquals(2, stockSpan.next(5));
        assertEquals(1, stockSpan.next(3));
        assertEquals(1, stockSpan.next(20));
        assertEquals(1, stockSpan.next(25));
    }

}