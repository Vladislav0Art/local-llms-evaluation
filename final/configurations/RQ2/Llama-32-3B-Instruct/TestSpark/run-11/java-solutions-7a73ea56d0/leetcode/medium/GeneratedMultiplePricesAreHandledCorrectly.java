package leetcode.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GeneratedMultiplePricesAreHandledCorrectly {

    @Test
    public void multiplePricesAreHandledCorrectly() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[]{1, 2, 3, 0, -1});
        assertEquals(List.of(2, 2, 2, 4, 5), getValues(result));
    }

}