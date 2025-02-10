package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestSetValues {

    @Test
    public void testSetValues() {
        Attributes attributes = new Attributes();
        attributes.set("key1", "value1");
        attributes.set("key2", "value2");

        String value1 = attributes.get("key1");
        String value2 = attributes.get("key2");

        Assertions.assertNotNull(value1);
        Assertions.assertNotNull(value2);

        Assertions.assertFalse(value1.equals(value2));
    }

}