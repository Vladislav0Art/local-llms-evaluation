package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Random;

public class GeneratedNext_DifferentPriceThenZero {

    @Test
    public void next_DifferentPriceThenZero() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(50);
        assertEquals(1, solution.next(100));
    }

}