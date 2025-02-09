package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Random;

public class GeneratedNext_ConsecutiveZero {

    @Test
    public void next_ConsecutiveZero() {
        OnlineStockSpan solution = new OnlineStockSpan();
        for (int i = 0; i < 10; i++) {
            solution.next(0);
        }
        solution.next(-1);
        assertEquals(2, solution.next(0));
    }

}