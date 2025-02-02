package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

public class GeneratedTestUpdate {

    @Test
    public void testUpdate() {
        Attributes attributes = new Attributes();

        String key1 = "test";
        String value1 = "value1";

        attributes.addInternalPrefix(key1);

        assertEquals("value1", attributes.getValue(0));
        System.out.println(attributes.update(0, value1)); // Expected: null

        String key2 = "prefixValue";
        attributes.removeInternalPrefix(key2);
        System.out.println(attributes.update(0, "newValue")); // Expected: new-value
    }

}