package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class GeneratedTestLeadingUnderscore {

    @Test
    public void testLeadingUnderscore() {
        String[] validStrings = {"#anchor1#", "#anchor2#"},
        {
            "test#anchor1", "test#anchor2"
        } ;
        for (String s : validStrings) {
            boolean result = AttributeUtil.isValidAnchor(s);
            Assert.assertTrue(result);
        }
    }

}