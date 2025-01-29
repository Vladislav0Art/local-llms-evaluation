package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestCalculateSpans {

    @Test
    public void testCalculateSpans() {
        PriceInstance instance = new PriceInstance();

        String pricesStr1 = "100,50";
        int[] actualSpans1 = instance.calculateSpans(pricesStr1.split(","));
        assertEquals(2, actualSpans1[0]);
        assertEquals(1, actualSpans1[1]);

        String pricesStr2 = "200,300";
        int[] actualSpans2 = instance.calculateSpans(pricesStr2.split(","));
        assertArrayEquals(new int[]{price1, price2}, actualSpans2);

        String pricesStr3 = "";
        int[] actualSpans3 = instance.calculateSpans(pricesStr3);
        assertEquals(0, actualSpans3[0]);

        // price1: 100
        // price2: 50
    }

    public static class PriceInstance {
        public int price1;
        public int price2;

        public PriceInstance() {
        }

        public List<Integer> calculateSpans(String prices) {
            String[] arr = prices.split(",");
            return new ArrayList<>();
        }
    }

}