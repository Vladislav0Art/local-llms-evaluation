package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Random;

public class Generated[next][mediumInput]

Test {

    private final OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void [next][mediumInput]Test() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        for (int i : prices) {
            stockSpan.next(i);
        }
        int expectedCount = 2;
        assertEquals(expectedCount, stockSpan.next(5));
    }

}