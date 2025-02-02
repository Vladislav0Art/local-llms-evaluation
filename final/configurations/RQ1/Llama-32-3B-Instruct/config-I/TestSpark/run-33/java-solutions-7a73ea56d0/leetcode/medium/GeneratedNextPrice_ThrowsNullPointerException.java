package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedNextPrice_ThrowsNullPointerException {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void nextPrice_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> onlineStockSpan.next(null));
    }
}

public class OnlineStockSpan {

    private int[] nums;
    private int pointer;

    public OnlineStockSpan(int[] nums) {
        this.nums = nums;
        this.pointer = 0;
    }

    public int next(int n) {
        if (n < nums.length) {
            return nums[n];
        } else {
            throw new RuntimeException();
        }
    }

    public int[] calculateSpans() {
        int[] result = new int[nums.length];
        result[pointer] = 1;
        pointer++;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] <= nums[i + 1]) {
                result[i] += result[i + 1];
            } else {
                result[i] = result[i + 1];
            }
            pointer++;
        }
        return result;
    }

}