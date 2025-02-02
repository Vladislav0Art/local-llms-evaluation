package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestStack {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void testStack() {
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(50);
        stack.push(40);
        stack.push(30);
        stack.push(20);
        stack.push(10);

        assertEquals((long) 1, stockSpan.next(100));

        while (!stack.isEmpty()) {
            assertEquals(stack.pop(), (int) stockSpan.next(5));
        }
    }

    public static class OnlineStockSpan {
        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        int next(int price) {
            if (list.isEmpty() || !list.get(list.size() - 1).equals(price)) {
                list.add(price);
            }

            while (!stack.isEmpty() && stack.peek().equals(price)) {
                list.remove(stack.pop());
            }

            stack.push(price);

            return list.size();
        }
    }

}