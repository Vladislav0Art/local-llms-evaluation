package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

public class GeneratedTestUpdateValues {

    @Test
    public void testUpdateValues() {
        Attributes attributes = new Attributes();

        String value1 = "value1";

        attributes.addInternalPrefix("test");
        assertEquals("test", attributes.getValue("test"));
        System.out.println(attributes.update(0, value1)); // Expected: null

        String key2 = "prefixValue";
        attributes.removeInternalPrefix(key2);
        System.out.println(attributes.update(0, "newValue")); // Expected: new-value
    }

}