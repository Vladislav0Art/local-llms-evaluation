package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestNormalize {

    @Test
    public void testNormalize() {
        // Test the normalize method to normalize all keys and values.
        Attributes attributes = new Attributes();

        attributes.set("value1", "value1");
        attributes.normalize();

        String dataPrefix = attributes.getDataPrefix();

        if (dataPrefix != null) {
            System.out.println(dataPrefix);
        } else {
            System.out.println(null);
        }
    }

}