package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetAttributes {

    @Test
    public void testGetAttributes() {
        // Test the get method to retrieve Attributes object.
        Attributes attributes = new Attributes();

        attributes.set("value1", "value1");
        attributes.normalize();

        Object attr = attributes.get("value1");

        if (attr instanceof String) {
            System.out.println(((String) attr));
        } else {
            // Handle different types of values in Attrubutes object.
        }
    }

}