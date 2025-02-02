package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Generated[next][IncreasingSequence]

Test {

    @Test
    public void [next][IncreasingSequence]Test() {
        OnlineStockSpan solution = new OnlineStockSpan();
        for (int i = 0; i < 10; i++) {
            solution.next(i * 2);
        }
        for (int i = 9; i >= 0; i--) {
            assertEquals(1, solution.next(i * 2));
        }
    }

}