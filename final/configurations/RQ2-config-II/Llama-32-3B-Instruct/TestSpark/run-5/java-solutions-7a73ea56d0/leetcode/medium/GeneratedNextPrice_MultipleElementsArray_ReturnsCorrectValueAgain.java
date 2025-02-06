package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedNextPrice_MultipleElementsArray_ReturnsCorrectValueAgain {

    @Test
    public void nextPrice_MultipleElementsArray_ReturnsCorrectValueAgain() {
        List<Integer> prices = new ArrayList<>();
        prices.add(10);
        prices.add(8);
        prices.add(9);
        prices.add(7);
        int result = OnlineStockSpan().next(6);
        assertEquals(2, result);
    }

}