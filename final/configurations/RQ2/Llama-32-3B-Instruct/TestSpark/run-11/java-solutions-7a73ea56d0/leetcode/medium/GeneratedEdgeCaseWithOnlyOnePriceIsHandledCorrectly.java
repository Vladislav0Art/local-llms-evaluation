package leetcode.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GeneratedEdgeCaseWithOnlyOnePriceIsHandledCorrectly {

    @Test
    public void edgeCaseWithOnlyOnePriceIsHandledCorrectly() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[]{1});
        assertEquals(List.of(1), getValues(result));
    }

    @Before
    public void setupMockForNextMethod() {
        when(OnlineStockSpan::next).thenReturn(0);
    }

    private static class CollectorsUtils {
        public static <T> List<T> collect(List<Integer> list) {
            return list.stream().map(Stream::of).flatMap(Stream::flatMap).collect(Collectors.toList());
        }

        public static int getMinValue(int[] values) {
            return Collections.min(Arrays.asList(values));
        }

        public static List<Integer> getValues(int[] values) {
            return collect(Arrays.asList(values));
        }
    }

}