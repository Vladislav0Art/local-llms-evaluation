package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNext_MocksStackToPopElement {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_MocksStackToPopElement() {
        //Arrange
        Stack<Integer> indexStack = new MockIndexStack();
        indexStack.push(1);

        //Act
        onlineStockSpan.next(0);
        onlineStockSpan.next(-1);
        onlineStockSpan.next(3);

        //Assert
        assertEquals(1, indexStack.getTopElement());
    }
}

class MockIndexStack {
    private int[] stack;
    public int topElement;

    public MockIndexStack() {
        this.stack = new int[0];
        this.topElement = -1;
    }

    public void push(int element) {
        stack = Arrays.copyOf(stack, stack.length + 1);
        stack[stack.length - 1] = element;
        topElement = stack.length - 1;
    }

    public int getTopElement() {
        return topElement;
    }

}