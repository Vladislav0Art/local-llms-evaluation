package leetcode.medium;

import java.util.*;

public class GeneratedTest {

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
    public void testCalculateSpans1() {
        PriceInstance instance = new PriceInstance("100,50");
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

    @Test
    public void testCalculateSpans2() {
        PriceInstance instance = new PriceInstance("300");
        String pricesStr1 = "200";
        int[] actualSpans1 = instance.calculateSpans(pricesStr1.split(","));
        assertEquals(0, actualSpans1[0]);

        // price1: 300
    }

    @Test
    public void testCalculateSpans3() {
        PriceInstance instance = new PriceInstance("500");
        String pricesStr1 = "400";
        int[] actualSpans1 = instance.calculateSpans(pricesStr1.split(","));
        assertEquals(0, actualSpans1[0]);

        // price1: 400
    }

    @Test
    public void testCalculateSpans4() {
        PriceInstance instance = new PriceInstance("700");
        String pricesStr1 = "800";
        int[] actualSpans1 = instance.calculateSpans(pricesStr1.split(","));
        assertEquals(0, actualSpans1[0]);

        // price1: 800
    }

    @Test
    public void testCalculateSpans5() {
        PriceInstance instance = new PriceInstance("900");
        String pricesStr1 = "100";
        int[] actualSpans1 = instance.calculateSpans(pricesStr1.split(","));
        assertEquals(0, actualSpans1[0]);

        // price1: 100
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

    @Test
    public void testCalculateSpans7() {
        PriceInstance instance = new PriceInstance("100");
        String pricesStr1 = "50";
        int[] actualSpans1 = instance.calculateSpans(pricesStr1.split(","));
        assertEquals(2, actualSpans1[0]);
        assertEquals(1, actualSpans1[1]);

        String pricesStr2 = "200";
        int[] actualSpans2 = instance.calculateSpans(pricesStr2.split(","));
        assertArrayEquals(new int[]{price3, price4}, actualSpans2);

        String pricesStr3 = "";
        int[] actualSpans3 = instance.calculateSpans(pricesStr3);
        assertEquals(0, actualSpans3[0]);

        // price1: 50
        // price2: 200
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

    @Test
    public void testCalculateSpans9() {
        PriceInstance instance = new PriceInstance(Arrays.asList(1, 2));
        String pricesStr1 = "3";
        int[] actualSpans1 = instance.calculateSpans(pricesStr1.split(","));
        assertEquals(2, actualSpans1[0]);
    }

    @Test
    public void testCalculateSpans10() {
        PriceInstance instance = new PriceInstance(Arrays.asList(4));
        String pricesStr1 = "5";
        int[] actualSpans1 = instance.calculateSpans(pricesStr1.split(","));
        assertEquals(1, actualSpans1[0]);
    }

}