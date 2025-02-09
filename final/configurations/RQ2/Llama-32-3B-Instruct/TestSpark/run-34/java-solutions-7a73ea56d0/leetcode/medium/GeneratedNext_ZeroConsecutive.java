package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Random;

public class GeneratedNext_ZeroConsecutive {

    @Test
    public void next_ZeroConsecutive() {
        OnlineStockSpan solution = new OnlineStockSpan();
        for (int i = 0; i < 10000; i++) {
            solution.next(0);
        }
        solution.next(-10);
        assertEquals(1, solution.next(0));
    }

}