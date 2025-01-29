package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

public class GeneratedTestMethod4 {

    @Test
    public void testMethod4() {
        public String getMinValue (String[]arr){
            String minValue = arr[0];
            for (String s : arr) {
                if (s.compareTo(minValue) < 0) {
                    minValue = s;
                }
            }
            return minValue;
        }

        int[] arr = {1, 2, 3};
        System.out.println(getMinValue(arr));
    }

}