package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

public class GeneratedTestMethod1 {

    @Test
    public void testMethod1() {
        int[] arr = {1, 2, 3};
        assertEquals(1, getMaxValue(arr));
        assertEquals(2, getMinValue(arr));
    }

    public String getMaxValue(int[] arr) {
        return Arrays.stream(arr).max().orElse(null);
    }

    public String getMinValue(int[] arr) {
        return Arrays.stream(arr).min().orElse(null);
    }

}