package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class GeneratedNextMultipleElements {

    public OnlineStockSpan solution = new OnlineStockSpan();

    @Test
    public void nextMultipleElements() {
        solution.next(100); // First price
        solution.next(80);   // Second price
        solution.next(110);  // Third price
        assertThat(solution.list, Arrays.asList(100, 80, 110));
    }

}