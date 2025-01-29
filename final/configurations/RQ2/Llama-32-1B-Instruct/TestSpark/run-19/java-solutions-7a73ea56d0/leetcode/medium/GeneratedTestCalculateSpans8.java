package leetcode.medium;

import java.util.*;

public class GeneratedTestCalculateSpans8 {

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
    public void testCalculateSpans8() {
        PriceInstance instance = new PriceInstance("500");
        String pricesStr1 = "100";
        int[] actualSpans1 = instance.calculateSpans(pricesStr1.split(","));
        assertEquals(0, actualSpans1[0]);

        // price1: 100
    }

    public static class PriceInstance {
        private List<Integer> prices;

        public PriceInstance(List<Integer> prices) {
            this.prices = prices;
        }
    }

}