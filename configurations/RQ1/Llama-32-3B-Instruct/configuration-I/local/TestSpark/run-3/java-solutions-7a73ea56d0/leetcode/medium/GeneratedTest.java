package leetcode.medium;

public class GeneratedTest {

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

}