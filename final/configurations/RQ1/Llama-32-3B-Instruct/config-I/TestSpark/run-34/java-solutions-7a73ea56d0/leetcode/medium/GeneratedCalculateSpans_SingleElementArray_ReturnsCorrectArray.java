package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpans_SingleElementArray_ReturnsCorrectArray {

    private int[] list = new int[0];

    public void next(int price) {
        list = Arrays.copyOf(list, list.length + 1);
        if (list[0] == price) {
            list[list.length - 1]++;
        } else {
            for (int i = 0; i < list.length; i++) {
                if (list[i] <= price) {
                    list = Arrays.copyOfRange(list, i, list.length + 1);
                    break;
                }
            }
            list[list.length - 1] += 1;
        }
    }

    public int[] calculateSpans(int[] prices) {
        for (int price : prices) {
            next(price);
        }
        return Arrays.copyOf(list, list.length);
    }
}

public class GeneratedTest {

    @Test
    public void calculateSpans_SingleElementArray_ReturnsCorrectArray() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {1};
        int[] result = solution.calculateSpans(prices);
        assertEquals(1, Arrays.stream(result).sum());
    }

}