package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestNext {

    public int[] calculateSpans(int[] prices) {
        Stack<Integer> indexStack = new Stack<>();
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            while (!indexStack.isEmpty() && prices[indexStack.peek()] <= prices[i]) {
                indexStack.pop();
            }
            if (indexStack.isEmpty()) {
                result[i] = 1;
            } else {
                result[i] = i - indexStack.peek();
            }
            indexStack.push(i);
        }
        return result;
    }

    public int next(int price) {
        Stack<Integer> indexStack = new Stack<>();
        while (!indexStack.isEmpty() && prices[indexStack.peek()] <= price) {
            indexStack.pop();
        }
        if (indexStack.isEmpty()) {
            result[0] = 1;
        } else {
            result[0] = 1 + next(price);
        }
        return result[0];
    }

    public int[] prices;

    @Test
    public void testNext() {
        this.prices = new int[]{100, 80, 60};
        next(100);
        System.out.println(result[0]); // 1
        next(80);
        System.out.println(result[0]); // 2
        next(60);
        System.out.println(result[0]); // 3
    }

}