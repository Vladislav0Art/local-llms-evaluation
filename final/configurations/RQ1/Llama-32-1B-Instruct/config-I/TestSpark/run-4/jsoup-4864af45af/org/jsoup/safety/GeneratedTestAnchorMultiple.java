package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class GeneratedTestAnchorMultiple {

    @Test
    public void testAnchorMultiple() {
        String[] validStrings = {"#anchor1", "#anchor2", "#anchor3"},
        {
            "test#anchor1", "test#anchor2", "test#anchor3"
        } ;
        for (String s : validStrings) {
            boolean result = AttributeUtil.isValidAnchor(s);
            Assert.assertTrue(result);
        }
    }

}