package org.jsoup.safety;

import org.junit.jupiter.api.Test;

public class GeneratedTestIsValidAnchor {

    @Test
    public void testIsValidAnchor() {
        String[] validStrings = {"#anchor", "test#anchor"};
        for (String s : validStrings) {
            assertTrue(AttributeUtil.isValidAnchor(s));
        }
    }

}