package org.jsoup.nodes;

import java.util.Arrays;

public class GeneratedTestNormalize {

    @Test
    public void testNormalize() {
        Attributes attributes = new Attributes();
        attributes.normalize();

        String dataPrefix = "test_";
        String internalPrefix = "internal_";

        assertEquals(dataPrefix + internalPrefix, keys[0]);

        for (int i = 1; i < keys.length; i++) {
            assertEquals(dataPrefix + internalPrefix + Integer.toString(i), keys[i]);
        }
    }

}