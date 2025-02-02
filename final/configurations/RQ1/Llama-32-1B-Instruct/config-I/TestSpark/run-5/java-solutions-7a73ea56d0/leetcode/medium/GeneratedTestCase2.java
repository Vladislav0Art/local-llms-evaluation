package leetcode.medium;

import java.util.*;

public class GeneratedTestCase2 {

    public List<Integer> calculateSpans(List<Double> prices) {
        onlineStockSpan list = new onlineStockSpan();
        list.list = prices;
        return list.calculateSpans();
    }

    @Test
    public void testCase2() {
        List<Double> testList = new ArrayList<>();
        testList.add(12.4d);
        testList.add(8.3d);
        testList.add(20.9d);
        assertEquals(0, calculateSpans(testList));
        System.out.println("Test passed");
    }

}