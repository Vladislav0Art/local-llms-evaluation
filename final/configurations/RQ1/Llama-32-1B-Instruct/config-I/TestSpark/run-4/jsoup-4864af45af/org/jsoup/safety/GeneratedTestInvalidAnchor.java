package org.jsoup.safety;

import org.junit.jupiter.api.Test;

public class GeneratedTestInvalidAnchor {

    @Test
    public void testInvalidAnchor() {
        String[] invalidStrings = {"#", "anchor", "#", "#"};
        for (String s : invalidStrings) {
            assertFalse(AttributeUtil.isValidAnchor(s));
        }
    }

}