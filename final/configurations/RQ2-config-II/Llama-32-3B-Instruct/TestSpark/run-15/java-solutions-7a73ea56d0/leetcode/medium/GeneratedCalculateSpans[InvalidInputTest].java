package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedCalculateSpans[InvalidInputTest]{

@Test
public void calculateSpans[
InvalidInputTest](){
OnlineStockSpan underTest = new OnlineStack();

assertThrows(NullPointerException .class, () ->underTest.

calculateSpans(null));
        }
        }

class OnlineStack {
    private Stack<Integer> stack;
    private int index;

    public OnlineStack() {
        this.stack = new Stack<>();
        this.index = 0;
    }

    public void next(int price) {
        while (!stack.isEmpty()) {
            if (stack.peek() <= price) {
                stack.pop();
            } else {
                break;
            }
        }
        stack.push(index);
        index++;
    }

    public int[] calculateSpans(int[] prices) {
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            int currentPrice = prices[i];
            while (!stack.isEmpty()) {
                if (currentPrice >= stack.peek()) {
                    stack.pop();
                } else {
                    break;
                }
            }
            result[i] = stack.size() + 1;
        }
        return result;
    }

}