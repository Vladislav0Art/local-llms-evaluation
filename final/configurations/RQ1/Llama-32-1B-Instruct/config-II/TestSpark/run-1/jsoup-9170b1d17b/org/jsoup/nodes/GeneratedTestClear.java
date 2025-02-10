package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestClear {

    @Test
    public void testClear() {
        Attributes attributes = new Attributes();
        attributes.set("key1", "value1");
        attributes.set("key2", "value2");

        String value1 = attributes.get("key1");
        String value2 = attributes.get("key2");

        attributes.clear();

        Assertions.assertFalse(attributes.hasKey(value1));
        Assertions.assertFalse(attributes.hasKey(value2));

        Assertions.isEmpty();
    }

}