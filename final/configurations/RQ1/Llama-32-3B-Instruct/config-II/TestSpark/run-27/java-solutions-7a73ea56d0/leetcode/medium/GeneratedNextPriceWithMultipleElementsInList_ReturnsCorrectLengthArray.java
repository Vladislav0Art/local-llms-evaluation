package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class GeneratedNextPriceWithMultipleElementsInList_ReturnsCorrectLengthArray {

    @Test
    public void nextPriceWithMultipleElementsInList_ReturnsCorrectLengthArray() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        onlineStockSpan.next(80);
        int[] result = onlineStockSpan.calculateSpans(new int[]{100, 80});
        assertThat(result.length, is(2));
        assertThat(result[0], is(1));
        assertThat(result[1], is(1));
    }

}

class MockedOnlineStockSpan {
    private List<Integer> list;
    private Stack<Integer> indexStack;

    public MockedOnlineStockSpan() {
        this.list = new ArrayList<>();
        this.indexStack = new Stack<>();
    }

    public void next(int price) {
        list.add(price);
        // No-op
    }

    public int[] calculateSpans(int[] prices) {
        // No-op, just returns the mock values
        return getMockedValues();
    }

    private int[] getMockedValues() {
        int[] mockedPrices = new int[]{100, 80, 75};
        Stack<Integer> stack = new Stack<>(Arrays.asList(0, 1, 2));
        return Arrays.stream(mockedPrices).map(index -> {
            if (stack.isEmpty()) {
                return index + 1;
            } else {
                return index - stack.peek();
            }
        }).toArray();
    }

}