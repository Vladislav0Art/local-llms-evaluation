package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

public class GeneratedTestMethod2 {

    @Test
    public void testMethod2() {
        int[] arr = {1, 2, 3};
        assertEquals("first", FirstChar.getFirstChar("Hello World!"));
    }

    public String getFirstChar(String str) {
        if (str.length() > 0) {
            return str.charAt(0);
        } else {
            throw new RuntimeException("String is empty");
        }
    }

}