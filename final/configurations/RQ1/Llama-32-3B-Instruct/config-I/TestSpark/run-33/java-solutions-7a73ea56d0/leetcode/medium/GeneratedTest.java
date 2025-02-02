package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void nextPrice_GreaterThanAllPreviousPrices_Returns1() {
        assertThat(onlineStockSpan.next(10), is(1));
    }

    @Test
    public void nextPrice_SameAsPreviousDay_Returns2() {
        onlineStockSpan.next(5);
        int result = (int) onlineStockSpan.next(5);
        assertThat(result, is(2));
    }

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyList() {
        assert onlineStockSpan.calculateSpans(new int[0]) == null;
    }

    @Test
    public void calculateSpans_SingleElementArray_ReturnsCorrectSpan() {
        int[] result = onlineStockSpan.calculateSpans(new int[]{10});
        assertThat((int) result[0], is(1));
    }

    @Test
    public void calculateSpans_MultipleElements_ReturnsCorrectSpans() {
        int[] result = onlineStockSpan.calculateSpans(new int[]{10, 5, 6, 4, 3, 2, 1});
        assert result[0] == 1;
        assert result[1] == 1;
        assert result[2] == 2;
        assert result[3] == 2;
        assert result[4] == 3;
        assert result[5] == 3;
        assert result[6] == 4;
    }

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