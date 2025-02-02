package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

public class GeneratedTestGetKey {

    @Test
    public void testGetKey() {
        Attributes attributes = new Attributes();

        String key = "test";
        attributes.addInternalPrefix(key);

        assertEquals(InternalPrefix + key, attributes.getKey(key));
        assertEquals("test", attributes.getValue(key));

        key = "test";
        attributes.removeInternalPrefix(key);
        System.out.println(attributes.getKey(key)); // Expected: test
    }

}