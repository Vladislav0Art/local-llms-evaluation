package leetcode.medium;

import java.util.Stack;
import java.util.List;

public class GeneratedTestCalculateSpans_MultiplePrices_ReturnsCorrectSpans {

    private Stack<Integer> indexStack = new Stack<>();
    private List<Integer> list = new ArrayList<>();

    public int next(int price) {
        while (!indexStack.isEmpty() && list.get(indexStack.peek()) <= price) {
            indexStack.pop();
        }
        if (indexStack.isEmpty()) {
            list.add(price);
            indexStack.push(list.size() - 1);
        } else {
            list.add(price - list.get(indexStack.peek()));
            indexStack.push(list.size() - 1);
        }
        return indexStack.size();
    }

    public int[] calculateSpans(int[] prices) {
        for (int price : prices) {
            next(price);
        }
        return new int[list.size()];
    }
}

public class OnlineStockSpanTest {

    @Test
    public void testCalculateSpans_MultiplePrices_ReturnsCorrectSpans() {
        int[] prices = {50, 60, 70, 80, 90};
        int[] result = new OnlineStockSpan().calculateSpans(prices);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

}