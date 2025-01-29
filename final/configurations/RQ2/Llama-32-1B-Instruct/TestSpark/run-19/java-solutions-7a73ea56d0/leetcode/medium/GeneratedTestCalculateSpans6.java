package leetcode.medium;

import java.util.*;

public class GeneratedTestCalculateSpans6 {

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
    public void testCalculateSpans6() {
        PriceInstance instance = new PriceInstance("1100");
        String pricesStr1 = "1200";
        int[] actualSpans1 = instance.calculateSpans(pricesStr1.split(","));
        assertEquals(2, actualSpans1[0]);
        assertEquals(1, actualSpans1[1]);

        String pricesStr2 = "2100,2200";
        int[] actualSpans2 = instance.calculateSpans(pricesStr2.split(","));
        assertArrayEquals(new int[]{price3, price4}, actualSpans2);

        String pricesStr3 = "";
        int[] actualSpans3 = instance.calculateSpans(pricesStr3);
        assertEquals(0, actualSpans3[0]);

        // price1: 1200
        // price2: 2200
    }

    public static class PriceInstance {
        private String pricesStr;

        public PriceInstance(String prices) {
            this.pricesStr = prices;
        }

        public List<Integer> calculateSpans() {
            return Arrays.asList(this.pricesStr.split(","));
        }
    }

}