package leetcode.medium;

import java.util.*;

public class GeneratedTestCase1 {

    public List<Integer> calculateSpans(List<Double> prices) {
        onlineStockSpan list = new onlineStockSpan();
        list.list = prices;
        return list.calculateSpans();
    }

    @Test
    public void testCase1() {
        assertEquals(0, 5);
        System.out.println("Test passed");
    }

}