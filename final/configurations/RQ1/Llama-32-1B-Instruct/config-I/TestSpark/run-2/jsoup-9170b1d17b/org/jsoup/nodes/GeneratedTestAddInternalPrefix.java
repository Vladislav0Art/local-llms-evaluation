package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

public class GeneratedTestAddInternalPrefix {

    @Test
    public void testAddInternalPrefix() {
        Attributes attributes = new Attributes();

        String key = "test";
        attributes.addInternalPrefix(key);

        assertEquals("test", attributes.getKey(key));
        assertEquals("value1", attributes.getValue(key));

        // Test removing internal prefix and adding new value
        attributes.removeInternalPrefix("test");
        System.out.println(attributes.getValue("test")); // Expected: null

        // Test updating existing value with different prefix
        key = "prefixValue";
        attributes.update(0, "newValue");

        assertEquals("prefixValue", attributes.getKey(key));
        assertEquals("newValue", attributes.getValue(key));

        // Test removing internal prefix from key
        key = "prefixValue";
        System.out.println(attributes.getKey(key)); // Expected: value1

        // Test updating existing value with different prefix
        key = "value2";
        attributes.update(0, "newValue");

        assertEquals("value2", attributes.getValue(key));
    }

}