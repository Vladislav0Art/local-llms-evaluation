package leetcode.medium;

public class GeneratedNextPrice_ReturnsCorrectValue {

    private Stack<Integer> stack;
    private List<Integer> list;

    public OnlineStockSpan() {
        this.stack = new Stack<>();
        this.list = new ArrayList<>();
    }

    public int next(int price) {
        while (!stack.isEmpty() && stack.peek() <= price) {
            list.add(stack.pop());
        }
        stack.push(price);
        return list.size();
    }

    public int[] calculateSpans() {
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

public class GeneratedTest {

    @Test
    public void nextPrice_ReturnsCorrectValue() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(100);
        assertEquals(result, 1);
    }

}