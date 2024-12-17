package leetcode.medium;

public class GeneratedCalculateSpans_DeterministicResult {

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
    public void calculateSpans_DeterministicResult() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {12, 1, 11, -4, -1, 2};
        int[] expected = {3, 2, 5, 6, 7, 8};
        int[] actual = onlineStockSpan.calculateSpans();
        assertArrayEquals(expected, actual);
    }

}