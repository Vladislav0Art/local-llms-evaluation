package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

public class GeneratedTest {

    public String getFirstChar(String str) {
        if (str.length() > 0) {
            return "" + str.charAt(0);
        } else {
            throw new RuntimeException("String is empty");
        }
    }

    @Test
    public void testMethod1() {
        // Your tests here
    }

}