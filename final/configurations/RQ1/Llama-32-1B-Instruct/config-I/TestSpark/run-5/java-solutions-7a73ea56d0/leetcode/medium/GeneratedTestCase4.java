package leetcode.medium;

import java.util.*;

public class GeneratedTestCase4 {

    public List<Integer> calculateSpans(List<Double> prices) {
        onlineStockSpan list = new onlineStockSpan();
        list.list = prices;
        return list.calculateSpans();
    }

    @Test
    public void testCase4() {
        List<Double> testList = new ArrayList<>();
        testList.add(3.7d);
        testList.add(9.5d);
        testList.add(15.1d);
        assertEquals(0, calculateSpans(testList));
        System.out.println("Test passed");
    }
}

class onlineStockSpan {

    public List<Integer> calculateSpans(List<Double> prices) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < prices.size(); i++) {
            list.add(list.get(i - 1) + 1);
        }
        return list;
    }

}