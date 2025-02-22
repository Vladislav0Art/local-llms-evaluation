package leetcode.medium;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextWithListNotEmptyTest {

    @Test
    public void nextWithListNotEmptyTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(10);
        onlineStockSpan.next(5);
        int actual = onlineStockSpan.next(8);
        assertEquals(2, actual);
    }

}