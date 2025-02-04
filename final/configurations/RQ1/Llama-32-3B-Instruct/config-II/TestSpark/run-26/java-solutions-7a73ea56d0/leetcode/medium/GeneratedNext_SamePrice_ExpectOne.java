package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNext_SamePrice_ExpectOne {

    @Test
    public void next_SamePrice_ExpectOne() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(10);
        assertEquals(1, onlineStockSpan.list.size());
    }

}