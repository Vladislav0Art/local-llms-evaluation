package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Stack;

public class GeneratedNext_SingleElementPrice_ReturnsOne {

    @Test
    public void next_SingleElementPrice_ReturnsOne() {
        OnlineStackSpan onlineStockSpan = new OnlineStackSpan();
        int price = 10;
        int result = onlineStockSpan.next(price);
        assertEquals(1, result);
    }

}