package leetcode.medium;

import java.util.*;

public class GeneratedTestCalculateSpans9 {

    public static class PriceInstance {
        private String pricesStr;

        public PriceInstance(String prices) {
            this.pricesStr = prices;
        }

        public List<Integer> calculateSpans() {
            String[] arr = pricesStr.split(",");
            return new ArrayList<>();
        }
    }

    @Test
    public void testCalculateSpans9() {
        PriceInstance instance = new PriceInstance(Arrays.asList(1, 2));
        String pricesStr1 = "3";
        int[] actualSpans1 = instance.calculateSpans(pricesStr1.split(","));
        assertEquals(2, actualSpans1[0]);
    }

}