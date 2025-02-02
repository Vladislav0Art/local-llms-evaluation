package leetcode.medium;

import java.util.*;

public class GeneratedTestCase3 {

    public List<Integer> calculateSpans(List<Double> prices) {
        onlineStockSpan list = new onlineStockSpan();
        list.list = prices;
        return list.calculateSpans();
    }

    @Test
    public void testCase3() {
        List<Double> testList = new ArrayList<>();
        testList.add(7.1d);
        testList.add(4.8d);
        testList.add(10.2d);
        assertEquals(0, calculateSpans(testList));
        System.out.println("Test passed");
    }

}