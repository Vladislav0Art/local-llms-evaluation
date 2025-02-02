package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class GeneratedTestEmptyAnchor {

    @Test
    public void testEmptyAnchor() {
        String[] validStrings = {"/anchor1/", "/anchor2/"},
        {
            "", ""
        } ;
        for (String s : validStrings) {
            boolean result = AttributeUtil.isValidAnchor(s);
            Assert.assertFalse(result);
        }
    }

}