package leetcode.medium;

import java.util.*;

public class GeneratedTestCalculateSpans10 {

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
    public void testCalculateSpans10() {
        PriceInstance instance = new PriceInstance(Arrays.asList(4));
        String pricesStr1 = "5";
        int[] actualSpans1 = instance.calculateSpans(pricesStr1.split(","));
        assertEquals(1, actualSpans1[0]);
    }

}