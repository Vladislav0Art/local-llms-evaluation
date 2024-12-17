package leetcode.medium;

import java.util.Stack;
import java.util.List;

public class GeneratedTestNext_LessThanPrice_ReturnsCorrectCount {

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
    public void testNext_LessThanPrice_ReturnsCorrectCount() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(50);
        onlineStockSpan.next(100);
        onlineStockSpan.next(90);

        assertEquals(2, onlineStockSpan.list.get(2));
    }

}