package leetcode.medium;

import java.util.*;

public class GeneratedTestCalculateSpans3 {

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
    public void testCalculateSpans3() {
        PriceInstance instance = new PriceInstance("500");
        String pricesStr1 = "400";
        int[] actualSpans1 = instance.calculateSpans(pricesStr1.split(","));
        assertEquals(0, actualSpans1[0]);

        // price1: 400
    }

}